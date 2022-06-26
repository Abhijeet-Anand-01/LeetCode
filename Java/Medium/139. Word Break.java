class Solution {

    HashMap<String, Boolean> memo = new HashMap<String, Boolean>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0)
            return true;

        if (memo.containsKey(s))
            return memo.get(s);

        for (String word : wordDict) {
            if (s.indexOf(word) == 0) {     // OR if (s.startsWith(word)) {
                String suffix = s.substring(word.length());
                if (wordBreak(suffix, wordDict)) {
                    memo.put(s, true);
                    return true;
                }
            }
        }
        memo.put(s, false);
        return false;
    }
}
