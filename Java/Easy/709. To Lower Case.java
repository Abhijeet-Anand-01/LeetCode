// Approach 1

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}


// Approach 2

class Solution {
    public String toLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                s = s.replace(s.charAt(i), (char)(s.charAt(i) + 32));
            }
        }
        return s;
    }
}
