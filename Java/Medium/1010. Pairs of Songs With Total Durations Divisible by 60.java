class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int in : time){
            // int x = (60 - in % 60 ) % 60;
            int modRem = in % 60;
            int x = modRem == 0 ? 0 : 60 - modRem;
            ans += hm.getOrDefault(x, 0);
            hm.put(modRem, hm.getOrDefault(modRem, 0) + 1);
        }
        return ans;
        
    }
}
