class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int flood = image[sr][sc];
        if (color != flood) floodFill(image, sr, sc, color, flood);
        return image;
    }
    private void floodFill(int[][] image, int sr, int sc, int color, int flood) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return;

        if (image[sr][sc] == flood) {
            image[sr][sc] = color;
            
                floodFill(image, sr - 1, sc, color, flood);
                floodFill(image, sr + 1, sc, color, flood);
                floodFill(image, sr, sc - 1, color, flood);
                floodFill(image, sr, sc + 1, color, flood);
            
        }
    }
}
