import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = 1 ; j < numbers.length ; j++){
                if(i != j && !answerList.contains(numbers[i] + numbers[j])){
                    answerList.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(answerList);
        answer = answerList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}