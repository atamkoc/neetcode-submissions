class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length - 1; i++){
            for (int j = 0; j<heights.length; j++){
                int currArea = calculateArea(i, j, heights[i], heights[j]);
                maxArea = Math.max(maxArea, currArea);
            }

        }

        return maxArea;    
    }

    public int calculateArea(int i , int j, int heightI, int heightJ){
        return (j-i) * Math.min(heightI, heightJ);
    }
}
