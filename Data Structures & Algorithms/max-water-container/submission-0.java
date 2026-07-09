class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                if (i != j) {
                    int area = (j - i) * (Math.min(heights[i], heights[j]));
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
    }
}
