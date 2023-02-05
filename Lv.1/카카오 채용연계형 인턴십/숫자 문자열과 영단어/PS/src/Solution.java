class Solution {
    public int solution(String s) {
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] matchNum = {"0", "1","2","3","4","5","6","7","8","9"};
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < numArr.length ; j++){
                //그냥 replace를 쓰는게 더 깔끔할 듯...
                if(i+numArr[j].length() <= s.length() && s.substring(i,i+numArr[j].length()).equals(numArr[j])){
                    s = s.substring(0,i) + matchNum[j] + s.substring(i+numArr[j].length());
                }
            }
        }
        return Integer.parseInt(s);
    }
}