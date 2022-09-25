class Solution {
    public String[] sortPeople(String[] names, int[] heights) {       
        quicksort(names, heights, 0, heights.length - 1);
        return names;
    }
    
    private void quicksort(String[] names, int[] heights, int low, int high) {
		if (low >= high) {
			return;
		}

		int start = low;
		int end = high;
		int mid = start + (end - start) / 2;
		int pivot = heights[mid];

		while (start < end) {
			while (heights[start] > pivot) {
				start++;
			}
			while (heights[end] < pivot) {
				end--;
			}
			int tempHeight = heights[start];
			heights[start] = heights[end];
			heights[end] = tempHeight;
            
            String tempName = names[start];
			names[start] = names[end];
			names[end] = tempName;

		}
		quicksort(names, heights, low, end - 1);
		quicksort(names, heights, start + 1, high);
	}
}
	
