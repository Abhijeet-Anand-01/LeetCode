class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for (int a : nums) { 
            sum += (a % 2 == 0 ? a : 0); 
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; ++i) {
            int idx = queries[i][1];
            if (nums[idx] % 2 == 0) { 
                sum -= nums[idx]; 
            }
            nums[idx] += queries[i][0];
            if (nums[idx] % 2 == 0) { 
                sum += nums[idx]; 
            }
            ans[i] = sum;
        }
        return ans; 
    }
}
