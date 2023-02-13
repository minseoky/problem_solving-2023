import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6,6};
        int matchCount = 0;
        int zeroCount = 0;
        List<Integer> lottosArr = new ArrayList<>();
        List<Integer> win_numsArr = new ArrayList<>();
        for(int i = 0 ; i < win_nums.length ; i++){ // 리스트로 변환
            lottosArr.add(lottos[i]);
            win_numsArr.add(win_nums[i]);
        }
        for(int i = 0 ; i < lottosArr.size() ; i++){
            if(win_numsArr.contains(lottosArr.get(i))){ // 내 번호가 포함되어있는지 확인
                matchCount++;
            }
            if(lottosArr.get(i) == 0){
                zeroCount++;
            }
        }
        answer[1] = matchCount >= 2 ? 7 - matchCount : 6; // 최저등수
        answer[0] = matchCount+zeroCount >= 2 ? 7 - matchCount - zeroCount : 6; //최고등수
        return answer;
    }
}