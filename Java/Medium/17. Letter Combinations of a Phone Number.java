class Solution {
    public List<String> letterCombinations(String digits) {
        return possibleCombinations("", digits);
    }
    
    private ArrayList<String> possibleCombinations(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!p.isEmpty()) {
                list.add(p);
            }
            return list;
        }

        int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;
        int end = (digit - 1) * 3;
        if (digit == 7) {
            end += 1;
        }
        if (digit == 8) {
            start += 1;
            end += 1;
        }
        if (digit == 9) {
            start += 1;
            end += 2;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(possibleCombinations(p + ch, up.substring(1)));
        }
        return ans;
    }
}
