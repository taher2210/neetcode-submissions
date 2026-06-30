class Solution {
    public int maxArea(int[] heights) {
        int max = 0 ;
        int n = heights.length-1;
        int i  = 0;
        int area = 0;
        int j = n;
        while(i < j){
            area = Math.min(heights[i], heights[j]) * (j-i);
            if(area > max){
                max = area;
            }
            if (heights[i] < heights[j]) {
                i++;
            } else {
                     j--;
                    }

            
        }
        return max;
        
    }
}
