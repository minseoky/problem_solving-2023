class Solution {
    public String solution(String new_id) {
        //step 1
        String answer = new_id.toLowerCase();
        //step 2
        for(int i = 0 ; i < answer.length() ; i++){
            if(answer.charAt(i) < 97 || answer.charAt(i) > 122){ // 알파벳 소문자인지 확인
                //소문자가 아니면
                if(answer.charAt(i) < '0' || answer.charAt(i) > '9'){ // 숫자인지 확인
                    //숫자가 아니면
                    if(answer.charAt(i) != '-' && answer.charAt(i) != '_' && answer.charAt(i) != '.'){ // 빼기, 밑줄, 마침표 확인
                        //빼기, 밑줄, 마침표도 아니면
                        answer = answer.substring(0, i) + answer.substring(i+1);
                        i--; //사라진 인덱스 보완
                    }
                }
            }
        }
        //step 3
        for(int i = 0 ; i < answer.length() ; i++){
            if(i+1 < answer.length() && answer.charAt(i) == '.' && answer.charAt(i+1) == '.'){
                answer = answer.substring(0, i) + answer.substring(i+1); // 마침표 하나 제거
                i--; //사라진 인덱스 보완
            }
        }
        //step 4
        if(!answer.isEmpty() && answer.charAt(0) == '.') answer = answer.substring(1);
        if(!answer.isEmpty() && answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, answer.length()-1);
        //step 5
        if(answer.isEmpty()) answer = "a";
        //step 6
        if(answer.length() >= 16) answer = answer.substring(0,15);
        if(answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, answer.length()-1);
        //step 7
        while(answer.length() <= 2) answer = answer + answer.substring(answer.length()-1);
        return answer;
    }
}