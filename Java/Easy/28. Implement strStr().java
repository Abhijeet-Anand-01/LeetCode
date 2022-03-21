// Approach 1 

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}


// Approach 2

class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (needle == null) {
            return 0;
        }
        for (int i = 0; i <= l1 - l2; i++) {
            if (haystack.substring(i, i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
