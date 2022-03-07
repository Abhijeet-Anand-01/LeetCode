class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        if(x == y) {   
            return count;
        }
        int diffBits = x ^ y;
        while(diffBits != 0){
            count += diffBits & 1;
            diffBits >>= 1;
        }
        return count;
    }
}
