class Solution {
    public int findComplement(int num) {
        int allOnes = 0;
        while (allOnes < num) {
            allOnes = (allOnes << 1) | 1;
        }
        return allOnes - num;
    }
}
