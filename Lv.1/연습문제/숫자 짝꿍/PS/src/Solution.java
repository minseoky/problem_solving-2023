class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int x[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //각 0123456789의 개수
        int y[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0 ; i < X.length() ; i++){
            x[X.charAt(i)-'0']++;
        }
        for(int i = 0 ; i < Y.length() ; i++){
            y[Y.charAt(i)-'0']++;
        }
        for(int i = 9 ; i >= 0 ; i--){
            while(x[i] > 0 && y[i] > 0){
                answer = answer+i;
                x[i]--;
                y[i]--;
            }
        }

        if(answer.equals("")){
            answer = "-1";
        }
        else if(answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }
}