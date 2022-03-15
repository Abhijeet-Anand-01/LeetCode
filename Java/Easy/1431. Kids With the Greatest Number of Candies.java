class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<Boolean>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        int ans = max - extraCandies;
        for (int candy : candies) {
            res.add(candy >= ans);
        }
        return res;
    }
}
