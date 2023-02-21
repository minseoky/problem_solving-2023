import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int expo = 0;
        while(Math.pow(3, expo+1) < n){
            expo += 1;
        }
        int[] trit = new int[expo + 1];
        for(int i = expo ; i >= 0 ; i--){
            while(n >= Math.pow(3,i)){
                trit[expo - i] += 1;
                n -= Math.pow(3,i);
            }
        }
        for(int i = 0 ; i < trit.length ; i++){
            answer += trit[i] * Math.pow(3,i);
        }
        return answer;
    }
}