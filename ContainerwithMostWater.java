//2 Pointers
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2 ) return 0;
        int n = height.length;
        int low = 0;
        int high = n-1;
        int maxArea = 0;
        while( high >= 0 && low < high){
            int currentArea = (high - low) * Math.min(height[low],height[high]);
            maxArea = Math.max(maxArea,currentArea); 
                if(height[low] < height[high]){     //Area = width (increasing/decreasing) * height
                    low++;  
                 }
                else{
                    high --;
                }
        }
           
        return maxArea;
    }
}

/*
TimeComplexity: O(n)
SpaceComplexity: O(1)
*/


BruteForce
//Brute force
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2) return 0; //no area
        int maxArea = 0;
        int n = height.length;
        for(int i = 0 ;i< n-1 ;i++){
            for(int j = i+1;j< n ;j++){
                int currentArea = (j-i)*Math.min(height[i],height[j]);
                maxArea = Math.max(maxArea,currentArea);
            }
        }        
        return maxArea;
        
    }
}

/*
TimeComplexity: O(n*n)
SpaceComplexity: O(n)
*/