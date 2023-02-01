class Solution {
    public int solution(int number, int limit, int power) {
        int requiredIron = 0;
        for(int i = 1 ; i <= number ; i++){
            int expectedIron = sumDivisorCount(i); // 예상 요구량
            if(expectedIron <= limit){ // 초과하지 않았을경우
                requiredIron += expectedIron;
            }
            else{ //초과했을 경우
                requiredIron += power;
            }
        }
        return requiredIron;
    }

    public static int sumDivisorCount(int number){ // 인수로 받은 정수의 약수의 개수를 반환하는 함수
        int count = 0;
        for(int i = 1 ; i*i <= number ; i++){
            if(i*i == number){
                count += 1;
            }
            else if(number % i == 0){
                count += 2;
            }
        }
        return count;
    }
}