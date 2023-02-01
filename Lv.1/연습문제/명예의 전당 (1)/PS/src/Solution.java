import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> minList = new ArrayList<>(); //매 회차의 최솟값 넣는 배열
        List<Integer> hallOfFame = new ArrayList<>();
        for(int i = 0 ; i < score.length ; i++){
            if(i < k){ // k번째까지는 그냥 넣기
                hallOfFame.add(score[i]); //그냥 넣기
            }
            else{ //이후엔 교체
                if(searchMinValueIndex(hallOfFame)[0] < score[i]){ // 새 값이 명예의 전당 최솟값보다 크면
                    hallOfFame.set(searchMinValueIndex(hallOfFame)[1],score[i]); // 명예의 전당에서 가장 작은 값의 인덱스 찾아서 새 값으로 교체
                }
            }
            minList.add(searchMinValueIndex(hallOfFame)[0]);//최솟값 answer에 넣기
        }
        int[] answer = minList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }

    public static int[] searchMinValueIndex(List<Integer> array){ // 입력받은 List에서 가장 작은 value와 해당 index 반환
        int minIndex = 0;
        int minValue = array.get(minIndex);
        for(int i = 0 ; i < array.size() ; i++){
            if(array.get(i) < minValue){
                minIndex = i;
                minValue = array.get(i);
            }
        }
        return new int[] {minValue, minIndex};
    }
}