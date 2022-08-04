// Approach 1 : Bit Manipulation

class Solution {
    public int[] countBits(int n) {
        int[] num = new int[n + 1];
        for (int i = 1; i <= n; i++) { 
            num[i] = num[i >> 1] + (i & 1);
        }
        return num;
    }
}


// Approach 2 : DP

class Solution {
    public int[] countBits(int num) {
        int result[] = new int[num + 1];
        int offset = 1;
        for (int index = 1; index < num + 1; ++index){
            if (offset * 2 == index){
                offset *= 2;
            }
            result[index] = result[index - offset] + 1;
        }
        return result;
    }
}
