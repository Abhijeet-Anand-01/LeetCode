// Approach 1

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, majority = 0;
        for (int num: nums) {
            if (count == 0) {
                majority = num;
                count++;
            }
            else if (num == majority) {
                count++;
            }
            else {
                count--;
            }
        }
        return majority;
    }
}


// Approach 2

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
