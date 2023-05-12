class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int a = 0, b = 1;

        while (b <= nums.length) {
            if (b == nums.length || nums[b - 1] + 1 != nums[b]) {
                if (a != b - 1)
                    res.add(nums[a] + "->" + nums[b - 1]);
                else res.add(nums[b - 1] + "");
                a = b;
                b++;
            }
            else {
                b++;
            }
        }
        return res;
    }
}
