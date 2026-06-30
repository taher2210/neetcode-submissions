class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
     for(int i = 0; i< nums.length; i++){
        map.put(nums[i], i);
     }
    
     for(int i = 0; i< nums.length; i++){
        int found = target - nums[i];
        if(map.containsKey(found) && map.get(found)!=i){
            return new int[]{i, map.get(found)};
    
        }
     }
     return new int[]{-1,-1};
     
    }
}
