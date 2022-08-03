// Approach 1 : Brute Force

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}


// Approach 2 : DP


class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; //dp[i] means the maximum subarray ending with A[i];
        int max = dp[0] = nums[0];;
        
        for(int i = 1; i < n; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
}
