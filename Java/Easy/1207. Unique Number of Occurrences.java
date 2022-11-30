class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> hs = new HashSet<Integer>();

        int temp = arr[0], freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) freq++;
            else {
                if (!hs.add(freq)) return false;
                freq = 1;
                temp = arr[i];
            }
        }
        if (!hs.add(freq)) return false;
        return true;
    }
}
