class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int i = 0, count = 0;
        while (i < s.length()) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
                i++;
            }
            else {
                count++;
                hs.clear();
            }
        }
        if (hs.size() != 0) count++;
        return count;
    }
}
