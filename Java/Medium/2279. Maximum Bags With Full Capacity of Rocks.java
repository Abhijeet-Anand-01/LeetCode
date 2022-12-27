class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int i;
        for (i = 0; i < capacity.length; i++) {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);

        for (i = 0; i < capacity.length; i++) {
            if (capacity[i] == 0) continue;
            additionalRocks -= capacity[i];
            if (additionalRocks < 0) break;
        }
        return i;
    }
}
