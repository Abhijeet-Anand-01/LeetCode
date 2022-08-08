class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, lenA = a.length(), lenB = b.length();
        for (int i = 0; i < lenA || i < lenB; i++) {
            int ia = (i < lenA) ? a.charAt(lenA - i - 1) - '0' : 0;
            int ib = (i < lenB) ? b.charAt(lenB - i - 1) - '0' : 0;
            // sb.insert(0, (ia + ib + carry) % 2);            // Insert takes O(n) : Not recommended to use here in this case bcoz it will give O(n^2)
            sb.append((ia + ib + carry) % 2);                  // Append takes O(1) 
            carry = (ia + ib + carry) / 2;
        }
        if (carry != 0) 
            sb.append(carry);
            // sb.insert(0, carry);
        
        return sb.reverse().toString();
        // return sb.toString();
    }
}
