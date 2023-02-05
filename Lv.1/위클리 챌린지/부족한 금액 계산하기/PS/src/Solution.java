class Solution {
    public long solution(int price, int money, int count) {
        long totalNeeds = 0;
        for(int i = 1 ; i <= count ; i++){
            totalNeeds = totalNeeds + (price*i);
        }
        return totalNeeds < money ? 0 : totalNeeds-money;
    }
}