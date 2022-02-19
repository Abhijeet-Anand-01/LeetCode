class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] customer: accounts) {
            int customerWealth = 0;
            for (int bank : customer) {
                customerWealth += bank;
                if (customerWealth > maxWealth)
                    maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }
}
