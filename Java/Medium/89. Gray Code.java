class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        int range = (int)Math.pow(2, n) - 1;
        for (int i = 0; i <= range; i++) {
            int copy = i >> 1;
            res.add(i ^ copy);
        }
        return res;
    }
}
