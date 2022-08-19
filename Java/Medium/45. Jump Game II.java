// Approach 1 : Brute Force

class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int count = 0;
        int i = 0, n = nums.length;
        while (i < n) {
            if (i + nums[i] >= n - 1) return count + 1;
            
            int sub = 1, maxJump = -1, maxJumpIdx = -1;
            int j = i + 1;
            while (j <= i + nums[i]) {
                if ((nums[i] - sub) < nums[j]) {
                    if (nums[j] - (nums[i] - sub) > maxJump) {
                        maxJump = nums[j] - (nums[i] - sub);
                        maxJumpIdx = j;
                    }  
                }
                j++;
                sub++; 
            }
            i = maxJumpIdx;
            count++;
        }
        return -1;
    }
}


// Approach 2 : Optimized

class Solution {
    public int jump(int[] nums) {
        
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }
}
