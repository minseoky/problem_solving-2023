class Solution {
    //"banana" -> ba na na
    public int solution(String s) {
        int answer = 0;
        int nextIndex;
        boolean swch = true;
        String currentStr = s;

        while(swch && currentStr.length() != 0){
            char firstChar = currentStr.charAt(0);
            int countX = 0;
            int countNotX = 0;
            for(int i = 0 ; i < currentStr.length() ; i++){
                if(currentStr.charAt(i) == firstChar){
                    countX++;
                }
                else{
                    countNotX++;
                }
                if(countX == countNotX){
                    nextIndex = i+1;
                    answer++;
                    currentStr = currentStr.substring(nextIndex);
                    break;
                }
                if(i+1 == currentStr.length()){
                    answer++;
                    swch = false;
                }
            }







        }




        return answer;
    }
}