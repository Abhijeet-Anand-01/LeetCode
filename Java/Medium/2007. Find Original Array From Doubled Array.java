// Approach 1 : HashMap

class Solution {
    public int[] findOriginalArray(int[] changed) {
       int n = changed.length, idx = 0;
        if (n % 2 == 1) return new int[0];
        int[] res = new int[n / 2];
        Map<Integer, Integer> count = new TreeMap<>();
        for (int a : changed)
            count.put(a, count.getOrDefault(a, 0) + 1);
        for (int x : count.keySet()) {
            if (count.get(x) > count.getOrDefault(x + x, 0))
                return new int[0];
            for (int j = 0; j < count.get(x); ++j) {
                res[idx++] = x;
                count.put(x + x, count.get(x + x) - 1);
            }
        }
        return res;
    }
}



// Approach 2 : Array

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length, idx= 0;
        if(n % 2 != 0) return new int[0];
        
        int[] res = new int[n / 2];
        int[] freq = new int[100001];
        
        for (int no : changed)
            freq[no]++;
        
        for (int no = 0; no < freq.length; no++) {   
            while (freq[no] > 0 && no * 2 < 100001 && freq[no * 2] > 0) {
                freq[no]--;
                freq[no*2]--;
                res[idx++] = no;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) return new int[0];
        }
        return res;
    }
}
