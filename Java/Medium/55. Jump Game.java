// Approach 1 : Brute Force

class Solution {
    public boolean canJump(int[] nums) {        
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (i > max) return false;
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
}


// Approach 2 : Clean code

class Solution {
    public boolean canJump(int[] nums) {
        int jump = nums[0];
        int i = 1;
        while (i < nums.length) {
            if (jump == 0) break;
            jump = Math.max(jump - 1, nums[i]);
            i++;
        }
        return i == nums.length;
    }
}
