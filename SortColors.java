//Dutch National Flag Problem 
//Using 3 pointers
//Follow up count of colors
class Solution {
    public void sortColors(int[] nums) {
        if( nums == null || nums.length == 0) return ;
        int left = 0; // all reds
        int current = 0; //all whites
        int right = nums.length - 1; //all blues
        
        while(current <= right ){
            if(nums[current]  == 1){
                current++;
            }
            else if(nums[current] == 2){
              //  swap(nums[mid],nums[high]);
                swap(nums, current,right);
                right--;
            }
            else{
               // swap(nums[low],nums[mid]);
                swap(nums, left,current);
                left++;
                current++;
            }
         }
        int zeroCount = 0; int oneCount =0; int twoCount =0;
        for(int i = 0;i< nums.length ;i++){
            if(nums[i] == 0) zeroCount++;
            else if(nums[i] == 1) oneCount++;
            else twoCount++;
        }
        
        int[] result = {zeroCount,oneCount,twoCount};
        
      System.out.println("Reds "+result[0]);
        System.out.println("Whites "+result[1]);
        System.out.println("Blues "+result[2]);
    }
    
    private void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a]  = nums[b];
        nums[b] = temp;
    }
}

/*
TimeComplexity : O(n) for sorting + O(n) for counting= O(2n)
Space Complexity : O(1)
*/