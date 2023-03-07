import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] wallpaper) {

        List<String> wpList = new ArrayList<>(Arrays.asList(wallpaper)); //toList
        //최소x 최소y 최대x 최대y
        int xLength = wallpaper.length;
        int yLength = wallpaper[0].length();
        int luy = yLength+1;
        int lux = 0;
        int rdy = 0;
        int rdx = 0;
        //최소x
        for(int i = 0 ; i < xLength ; i++){
            if(wpList.get(i).contains("#")){
                lux = i;
                break;
            }
        }
        //최대x
        for(int i = xLength-1 ; i >= 0 ; i--){
            if(wpList.get(i).contains("#")){
                rdx = i+1;
                break;
            }
        }
        //최소y 최대y
        for(int i = 0 ; i < xLength ; i++){
            for(int j = 0 ; j < yLength ; j++){
                if(wpList.get(i).contains("#")){
                    luy = (luy > wpList.get(i).indexOf("#") ? wpList.get(i).indexOf("#") : luy);
                    rdy = (rdy < wpList.get(i).lastIndexOf("#")+1 ? wpList.get(i).lastIndexOf("#")+1 : rdy);

                }
            }
        }
        int[] answer = {lux, luy, rdx, rdy};
        return answer;
    }
}