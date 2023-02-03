class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; //누적으로 받은 콜라의 양
        int empty = n; //현재 가진 빈 병
        while(empty >= a){ // 빈 병이 a 미만일 때까지
            int newCoke = (empty / a)*b;
            answer += newCoke;
            empty = (empty % a) + newCoke;
        }
        return answer;
    }
}