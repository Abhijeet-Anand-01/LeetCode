class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] charArr = new int[26];
        for (char ch : word1.toCharArray()) 
            charArr[ch - 'a']++;
        
        for (char ch : word2.toCharArray()) 
            charArr[ch - 'a']--;
        
        for (int val : charArr) {
            if (Math.abs(val) > 3) return false;
        }
        return true;
    }
}
