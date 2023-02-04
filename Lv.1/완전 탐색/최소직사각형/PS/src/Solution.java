class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int maxY = 0;
        for(int i = 0 ; i < sizes.length ; i++){
            if(sizes[i][0] > sizes[i][1]){ //X>Y일때
                if(maxX < sizes[i][0]){
                    maxX = sizes[i][0];
                }
                if(maxY < sizes[i][1]){
                    maxY = sizes[i][1];
                }
            }
            else{
                if(maxX < sizes[i][1]){
                    maxX = sizes[i][1];
                }
                if(maxY < sizes[i][0]){
                    maxY = sizes[i][0];
                }
            }
        }
        answer = maxX*maxY;
        return answer;
    }
}