class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = -100;
        int min = 0;
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum = sum + nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        if(max < 0){
            return max;
        }
        sum = 0;
        for(int i = 0; i< nums.length; i++){
           if(sum > 0){
            sum = 0;
           }
           sum = sum + nums[i];
           if(min > sum){
            min = sum;
           }
        }
        sum = 0;
        for(int i =0; i< nums.length; i++){
            sum = sum + nums[i];
        }
        
        return Math.max(max, (sum - min));


       
    }
}