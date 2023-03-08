import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        //int[] colored = {}; //List로 변환
        List<Integer> colored = new ArrayList<>();
        for(int i = 0 ; i < section.length ; i++){
            if(!colored.contains(section[i])){ //colored에 존재하지 않으면
                for(int j = section[i] ; j <= n && j < section[i] + m ; j++){
                    colored.add(j);
                }
                count++;
            }
        }
        return count;
    }
}