/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
		int peak, peakDublicate, ans = -1;
		int start = 0, end = mountainArr.length() - 1;

        // Finding the peak(max value) of the array
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		peak = start;
		peakDublicate = peak;

        // Search for the target in the first half(ascending) from start to peak in the array
		start = 0;
		while (start <= peak) {
			int mid = start + (peak - start) / 2;
			if (target < mountainArr.get(mid)) {
				peak = mid - 1;
			} else if (target > mountainArr.get(mid)) {
				start = mid + 1;
			} else {
				ans = mid;
				break;
			}
		}
        
        // If the target not found in the first half then only search in the second hard(decending) from peak+1 to the end of the array
		if (ans == -1) {
			end = mountainArr.length() - 1;
			peak = peakDublicate + 1;
			while (peak <= end) {
				int mid = peak + (end - peak) / 2;
				if (target > mountainArr.get(mid)) {
					end = mid - 1;
				} else if (target < mountainArr.get(mid)) {
					peak = mid + 1;
				} else {
					ans = mid;
					break;
				}
			}
		}
		return ans;
    }
}
