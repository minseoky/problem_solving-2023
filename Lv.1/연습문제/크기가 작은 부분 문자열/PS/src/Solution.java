public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int l = p.length();
        int times = t.length() - p.length() + 1;
        for(int i = 0 ; i < times ; i++){
            if (Long.parseLong(t.substring(i, l+i)) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
