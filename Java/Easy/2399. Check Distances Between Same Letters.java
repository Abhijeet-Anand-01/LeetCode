class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), i);
            }
            else {
                int diff = i - hm.get(s.charAt(i)) - 1;
                if (distance[s.charAt(i) - 'a'] != diff) 
                    return false;
            }
        }
        return true;
    }
}
