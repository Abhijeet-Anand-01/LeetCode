class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min = 10;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    if (num1 < min)
                        min = num1;
                }
            }
        }
        if (min != 10) return min;
        
        int min1 = 10, min2 = 10;
        for (int num : nums1) {
            if (num < min1)
                min1 = num;
        }
        for (int num : nums2) {
            if (num < min2)
                min2 = num;
        }
        if (min1 < min2) return (min1 * 10) + min2;
        return (min2 * 10) + min1;
    }
}
