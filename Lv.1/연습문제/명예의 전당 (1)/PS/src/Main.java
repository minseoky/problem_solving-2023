import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        //result = {10, 10, 10, 20, 20, 100, 100};

        int result[] = sol.solution(k, score);
        System.out.println(Arrays.toString(result));

    }
}