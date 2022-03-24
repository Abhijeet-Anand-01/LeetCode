// Approach 1

class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i : arr) {
            if(i <= k)
                k++; 
            else break;
        }
        return k;
    }
}


// Approach 2

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - 1 - mid < k)
                start = mid + 1;
            else
                end = mid;
        }
        return start + k;
    }
}
