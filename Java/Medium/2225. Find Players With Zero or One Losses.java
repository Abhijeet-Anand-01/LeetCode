class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] won = new int[100001];
        int[] loss = new int[100001];
        
        for(int[] match : matches) {
            won[match[0]]++;
            loss[match[1]]++;
        }
        
        List<List<Integer>> ans  = new ArrayList<>();
        
        List<Integer> wonAllMatches = new ArrayList<>();
        List<Integer> lostOneMatch = new ArrayList<>();
        
        for(int i = 0; i < won.length; i++) {
            if(won[i] > 0 && loss[i] == 0) {
                wonAllMatches.add(i);
            }
            if(loss[i] == 1) {
                lostOneMatch.add(i);
            }
        }
        
        ans.add(wonAllMatches);
        ans.add(lostOneMatch);
        
        return ans;
    }
}


// class Solution {
//     public List<List<Integer>> findWinners(int[][] matches) {
//         List<List<Integer>> res = new ArrayList<>();
//         HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//         for (int[] match : matches) {
//             int val = match[1];
//             hm.put(val, hm.getOrDefault(val, 0) + 1);
//         }
//         List<Integer> winners = new ArrayList<>();
//         for (int[] match : matches) {
//             if (!winners.contains(match[0]) && !hm.containsKey(match[0])) {
//                 winners.add(match[0]);
//             }
//         }
//         Collections.sort(winners);
//         res.add(winners);

//         List<Integer> losers = new ArrayList<>();
//         for (int key : hm.keySet()) {
//             if (hm.get(key) == 1) {
//                 losers.add(key);
//             }
//         }
//         Collections.sort(losers);
//         res.add(losers);
//         return res;
//     }
// }
