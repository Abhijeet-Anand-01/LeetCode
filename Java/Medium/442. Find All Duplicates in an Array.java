// Approach 1 : Using cyclic ssort

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


// Approach 2 : Best optimized

class Solution {
    public List<Integer> findDuplicates(int[] nums) {ex]);      
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(Math.abs(nums[i]));
            nums[index] = -nums[index];
        }
        return res;
    }
}


// Approach 3 : 100% faster

class Solution {
    public List<Integer> findDuplicates(int[] nums) {       
        int[] freq = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]] += 1;
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i] > 1) {
                res.add(i);
            }
        }
        return res;
    }
}
