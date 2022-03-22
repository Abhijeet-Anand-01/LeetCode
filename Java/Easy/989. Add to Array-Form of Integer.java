class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        ArrayList<Integer> ans = new ArrayList();

        while (--n >= 0 || k > 0) {
            if (n >= 0)
                k += num[n];
                ans.add(k % 10);
                k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
