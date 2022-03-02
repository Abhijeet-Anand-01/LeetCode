class Solution {
    public String addBinary(String a, String b) {
        String sb = "";
        int carry = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()) || carry != 0; i++) {
            int ia = (i < a.length()) ? a.charAt(a.length() - i - 1) - '0' : 0;
            int ib = (i < b.length()) ? b.charAt(b.length() - i - 1) - '0' : 0;
            sb = ((ia + ib + carry) % 2) + sb;
            carry = (ia + ib + carry) / 2;
        }
        return sb;
    }
}
