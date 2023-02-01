import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
//    사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때,
//    과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.
    public int solution(int k, int m, int[] score) {
        int price = 0;
        int boxCount = score.length / m; //총 상자 개수
        List<Integer> apples = new ArrayList<>();
        for(int i = 0 ; i < score.length ; i++){
            apples.add(score[i]);
        }
        List<List<Integer>> boxes = new ArrayList<>();
        int startIndex = 0;
        for(int i = 0; i < boxCount ; i++){
            List<Integer> box = new ArrayList<>();
            Collections.sort(apples, Collections.reverseOrder());
            for(int j = startIndex ; j < m+startIndex ; j++){
                box.add(apples.get(j));
            }
            startIndex += m;
            //boxes에 box 넣기
            boxes.add(box);
        }
        //boxes안 box마다 가격매기기
        for(int i = 0 ; i < boxes.size() ; i++){
            price += Collections.min(boxes.get(i)) * m;
        }
        return price;
    }
}
