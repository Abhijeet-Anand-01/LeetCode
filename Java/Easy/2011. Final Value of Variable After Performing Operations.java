// Approach 1

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String elem : operations) {
            if (elem.equals("++X") || elem.equals("X++"))
                x+=1;
            else x-=1;
        }
        return x;
    }
}


// Approach 2

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String elem : operations) {
            x = elem.equals("++X") || elem.equals("X++") ? ++x : --x;
        }
        return x;
    }
}
