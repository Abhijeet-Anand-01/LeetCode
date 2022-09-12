class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int start = 0, end = tokens.length - 1, score = 0, maxScore = 0;
        while (start <= end) {
            if (tokens[start] <= power) {
                power -= tokens[start++];
                score++;
                maxScore = Math.max(maxScore, score);
            }
            else {
                if (score == 0) break;
                power += tokens[end--];
                score--;
            }
        }
        return maxScore;
    }
}
