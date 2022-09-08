class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i<= n-2; i++){
            if(!checkPalindromic(n, i))
                return false;
        }
        return true;
        
    }
     public boolean checkPalindromic(int n, int b) {
         int dub = n;
         int rev = 0;
         while(dub > 0){
             rev = rev * b + dub % b;
             dub = dub/b;
         }
         return n == rev;
     }
}
