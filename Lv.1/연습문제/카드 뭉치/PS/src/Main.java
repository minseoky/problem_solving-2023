public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(sol.solution(cards1, cards2, goal));
    }
}