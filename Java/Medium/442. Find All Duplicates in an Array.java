class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;
			if (nums[i] != nums[correctIndex]) {
				int temp = nums[correctIndex];
				nums[correctIndex] = nums[i];
				nums[i] = temp;
			} else {
				i++;
			}
		}
        
		ArrayList<Integer> ans = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(nums[index]);
			}
		}
        
        return ans;
    }
}
