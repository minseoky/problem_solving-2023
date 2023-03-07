import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] wallpaper = {"###", "##."};
        //[x,y,x,y]

        System.out.println(Arrays.toString(sol.solution(wallpaper)));
    }
}