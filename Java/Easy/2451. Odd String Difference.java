class Solution {
    public String oddString(String[] words) {
        ArrayList<ArrayList<Integer>> helperList = new ArrayList<ArrayList<Integer>>();
        
        for (String word : words) {
            ArrayList<Integer> arr = new ArrayList<Integer>(word.length() - 1);
            for (int i = 1; i < word.length(); i++) {
                arr.add(word.charAt(i) - word.charAt(i - 1));
            }
            helperList.add(arr);
        }
        
        HashMap<ArrayList<Integer>, ArrayList<Integer>> hm = new HashMap<>();

        for (int i = 0; i < helperList.size(); i++) {
            
            if (!hm.containsKey(helperList.get(i))) {
                hm.put(helperList.get(i), new ArrayList<Integer>());
                hm.get(helperList.  get(i)).add(i);
            }
            else {
                hm.get(helperList.get(i)).add(i);
            }
        }
        Set<ArrayList<Integer>> set = hm.keySet();
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(set);
        
        if (hm.get(list.get(0)).size() == 1) {
            return words[hm.get(list.get(0)).get(0)];
        }
        else return words[hm.get(list.get(1)).get(0)];
    }
}
