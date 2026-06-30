class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;

            while (high > low) {
                int sum = nums[low] + nums[high] + nums[i];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    low++;
                    high--;

                    // Skip duplicate low values
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    // Skip duplicate high values
                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }

                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return result;
    }
}