//  Approach 1: array

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];
        
        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }
        
        for(boolean existLetter : letters) {
            if(!existLetter) 
                return false;
        }
        
        return true;
    }
}


//  Approach 2: bit manipulation

class Solution {
    public boolean checkIfPangram(String sentence) {
        int seen = 0;
        for(char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        return seen == ((1 << 26) - 1);
    }
}



//  Approach 2: bit manipulation

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashSet<Character> hs = new HashSet<Character>();
        for (char c : sentence.toCharArray())
            hs.add(c);

        if (hs.size() == 26) return true;
        else return false;
    }
}
