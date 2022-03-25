class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int count = 0;
            for (String elem : sentence.split(" ")) {
                count++;
            }
            if (max < count)
                    max = count;
        }
        return max;
    }
}
