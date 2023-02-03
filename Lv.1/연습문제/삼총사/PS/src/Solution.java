class Solution {
    public int solution(int[] number) {
        //정수배열에서 3개 골라 0되는 경우의 수?
        int answer = 0;
        for(int i = 0 ; i < number.length ; i++){
            for(int j = i + 1 ; j < number.length ; j++){
                for(int k = j + 1 ; k < number.length ; k++){
                    if(number[i]+number[j]+number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}