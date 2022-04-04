// Approach 1 : Looping

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


// Approach 2 : Recursion

class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    private int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = start + (end - start) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        else if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid - 1);
        }
        else return binarySearch(nums, target, mid + 1, end);
        
    }
}
