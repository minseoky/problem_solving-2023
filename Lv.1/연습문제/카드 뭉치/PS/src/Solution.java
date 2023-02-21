import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> cardlist1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> cardlist2 = new ArrayList<>(Arrays.asList(cards2));
        List<String> goallist = new ArrayList<>(Arrays.asList(goal));
        for(int i = 0 ; i < goallist.size() ; i++){
            if(cardlist1.size() >= 1 && cardlist1.get(0).equals(goallist.get(i))){
                cardlist1.remove(goallist.get(i));
            }
            else if(cardlist2.size() >= 1 && cardlist2.get(0).equals(goallist.get(i))){
                cardlist2.remove(goallist.get(i));
            }
            else{
                answer = "No";
            }
        }
        return answer;
    }
}