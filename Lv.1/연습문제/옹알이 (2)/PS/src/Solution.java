class Solution {
    //"aya", "ye", "woo", "ma"

    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0 ; i < babbling.length ; i++){
            int symbol = 0;
            while(true) {
                if (babbling[i].length() >= 2 && babbling[i].substring(0, 2).equals("ye") && symbol != 1) {
                    babbling[i] = babbling[i].substring(2);
                    symbol = 1;
                }
                else if (babbling[i].length() >= 2 && babbling[i].substring(0, 2).equals("ma") && symbol != 2) {
                    babbling[i] = babbling[i].substring(2);
                    symbol = 2;
                }
                else if(babbling[i].length() >= 3 && babbling[i].substring(0,3).equals("aya") && symbol != 3){
                    babbling[i] = babbling[i].substring(3);
                    symbol = 3;
                }
                else if(babbling[i].length() >= 3 && babbling[i].substring(0,3).equals("woo") && symbol != 4){
                    babbling[i] = babbling[i].substring(3);
                    symbol = 4;
                }
                else if(babbling[i].equals("")){
                    answer++;
                    break;
                }
                else{
                    break;
                }
            }
        }
        return answer;
    }
}