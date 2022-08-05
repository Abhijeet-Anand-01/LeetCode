// Approach 1 : T.C: O(nlogn)  S.C: O(n)

class Solution {
    public int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, count = 0;
        boolean flag = false;
        while (i < s.length()) {
            if (i != s.length() - 1 && arr[i] == arr[i + 1]) {
                i+=2;
                count+=2;
            }
            else {
                i+=1;
                flag = true;
            }
        }
        
        if (flag) return count + 1;
        else return count;
    }
}


// Approach 2 : T.C: O(2n)  S.C: O(n)

class Solution {
    public int longestPalindrome(String s) {
        
        int len = s.length();
        int size = 128;
        int[] counts = new int[size];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }

        int result = 0;
        for (int i = 0, bound = size; i < size; i++) {
            result += (counts[i] / 2 * 2);
        }
        return result == len? result: result + 1;
    }
}


// Approach 3 : T.C: O(n)  S.C: O(n)

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count * 2 + 1;
        return count * 2;
    }
}
