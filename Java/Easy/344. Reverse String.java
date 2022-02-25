class Solution {
    public void reverseString(char[] s) {
        reverseRecurssion(s, 0);
    }
    
    private void reverseRecurssion(char[] s, int index){
        if(index < s.length) {
            char temp = s[index];
            reverseRecurssion(s, index + 1);
            s[s.length - 1  - index] = temp;
        }
    }
}
