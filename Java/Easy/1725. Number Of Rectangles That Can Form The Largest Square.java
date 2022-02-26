class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        return countGoodRectangles(rectangles, 0, 0, 0);
    }	
	
    public int countGoodRectangles(int[][] rectangles, int x, int maxVal, int count) {
	
        if (x == rectangles.length) { 
            return count;
        }
		
        int min = Math.min(rectangles[x][0], rectangles[x][1]);

        return min > maxVal ? countGoodRectangles(rectangles, x + 1, min, 1) :		
                min == maxVal ? countGoodRectangles(rectangles, x + 1, maxVal, count + 1) :				
                        countGoodRectangles(rectangles, x + 1, maxVal, count);
    }
}
