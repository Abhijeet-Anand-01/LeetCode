// Approach 1 : Not recommended

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}


// Approach 2

class Solution {
    public int strStr(String haystack, String needle) {
        
        int len1 = haystack.length(), len2 = needle.length();    
        for (int i = 0; i < len1 - len2 + 1; i++) {
            if (haystack.substring(i, i + len2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
