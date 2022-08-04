// Approach 1

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, start = 0, end = n - 1;
        int[] result = new int[n];
        
        for (int i = n - 1; i >= 0 ; i--) {
            if (Math.abs(nums[start]) > nums[end])
                result[i] = nums[start] * nums[start++];
            
            else result[i] = nums[end] * nums[end--];
        }
        
        return result;
    }
}


// Approach 2 : Conditional

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, start = 0, end = n - 1;
        int[] result = new int[n];
        
        for (int i = n - 1; i >= 0 ; i--) {
            result[i] = Math.abs(nums[start]) > nums[end] ? nums[start] * nums[start++] : nums[end] * nums[end--]; 
        return result;
    }
}
