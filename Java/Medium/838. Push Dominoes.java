class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder res = new StringBuilder(dominoes);
        int left = -1, right = -1;
        boolean flagR = false;
        
        for (int i = 0; i < dominoes.length(); i++) {
            if (dominoes.charAt(i) == '.') {
                continue;
            }
            else if (dominoes.charAt(i) == 'L') {
                left = i - 1;
                if (flagR) {
                    while (right < left) {
                        res.setCharAt(right, 'R');
                        res.setCharAt(left, 'L');
                        right++;
                        left--;
                    }
                    flagR = false;
                }
                else {
                    while (left >= 0 && dominoes.charAt(left) == '.') {
                        res.setCharAt(left, 'L');
                        left--;
                    }
                }
            }
            else if (dominoes.charAt(i) == 'R') {
                if (flagR) {
                    while (right < i) {
                        res.setCharAt(right, 'R');
                        right++;        
                    }
                }
                // else {
                    right = i + 1;
                    flagR = true;
                // }
            }
        }
        
        if (flagR) {
            while (right < dominoes.length()) {
                res.setCharAt(right, 'R');
                right++;
            }
        }
        
        return res.toString();
    }
 }
