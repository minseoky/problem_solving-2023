import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        for(int index = 1 ; index < s.length() ; index++){
            char currentChar = s.charAt(index);
            int count = 1;
            while(count <= index){
                if(s.charAt(index-count) == s.charAt(index)){
                    arr.add(count);
                    break;
                }
                else if(count == index){
                    arr.add(-1);
                    break;
                }
                count++;
            }
        }

        int[] answer = new int[arr.size()];
        for(int i = 0 ; i < arr.size() ; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}