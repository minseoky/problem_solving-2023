import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Solution {

    public int solution(int k, int m, int[] score) {
        int price = 0;
        Arrays.sort(score);
        for(int i = score.length ; i >= m ; i -= m){
            price += score[i-m]*m;
        }
        return price;
    }
//    public int solution(int k, int m, int[] score) {
//        int price = 0;
//        int boxCount = score.length / m; //총 상자 개수
//        List<Integer> apples = new ArrayList<>();
//        for(int i = 0 ; i < score.length ; i++){
//            apples.add(score[i]);
//        }
//        List<List<Integer>> boxes = new ArrayList<>();
//        int startIndex = 0;
//        Collections.sort(apples, Collections.reverseOrder());
//        for(int i = 0; i < boxCount ; i++){
//            List<Integer> box = new ArrayList<>();
//            for(int j = startIndex ; j < m+startIndex ; j++){
//                box.add(apples.get(j));
//            }
//            startIndex += m;
//            //boxes에 box 넣기
//            boxes.add(box);
//        }
//        //boxes안 box마다 가격매기기
//        for(int i = 0 ; i < boxes.size() ; i++){
//            price += Collections.min(boxes.get(i)) * m;
//        }
//        return price;
//    }
}
