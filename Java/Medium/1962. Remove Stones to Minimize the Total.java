class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int pile : piles) {
            heap.add(pile);
        }
        
        for (int i = 0; i < k; i++) {
            int max = heap.remove();
            int remove = max / 2;
            heap.add(max - remove);
        }
        
        int sum = 0;
        for (int num : heap) {
            sum += num;
        }
        
        return sum;
    }
}
