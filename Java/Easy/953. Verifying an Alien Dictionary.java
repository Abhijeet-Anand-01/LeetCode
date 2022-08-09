// Approach 1 : Hashmap

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>(26);
        for (int i = 0; i < order.length(); i++) {
            hm.put(order.charAt(i), i);
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            
            for (int j = 0; j < words[i].length(); j++) {
                if (j > words[i + 1].length() - 1) return false;
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    if (hm.get(words[i].charAt(j)) > hm.get(words[i + 1].charAt(j))) return false;
                    else break;
                }
            }
        
        }
        
        return true;
    }
}


// Approach 2 : Array

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++){
            orderMap[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                if (j >= words[i + 1].length()) return false;

                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int currentWordChar = words[i].charAt(j) - 'a';
                    int nextWordChar = words[i + 1].charAt(j) - 'a';
                    if (orderMap[currentWordChar] > orderMap[nextWordChar]) return false;
                    else break;
                }
            }
        }

        return true;
    }
}
