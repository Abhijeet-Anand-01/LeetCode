class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int start = 0, end = potions.length;

            while (start < end) {
                int mid = start + (end - start) / 2;
                if ((long)spells[i] * potions[mid] >= success) {
                    end = mid;
                }
                else start = mid + 1;
            }
            spells[i] = potions.length - end;
        }
        return spells;
    }
}
