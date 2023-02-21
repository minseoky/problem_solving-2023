import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> tri = new ArrayList<>(); //1 3 9 27 81 ... 이미 반전된 상태로 저장
        while(n >= 1){ // 삼진법 리스트 만들기
            tri.add(n%3);
            n = n / 3;
        }
        int mul = 1;
        for(int i = tri.size()-1 ; i >= 0 ; i--){ // 십진법으로 변환
            answer += tri.get(i) * mul;
            mul *= 3;
        }
        return answer;
    }
}