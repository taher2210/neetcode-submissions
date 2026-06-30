class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int[] arr : matrix) {
            if (target <= arr[arr.length - 1]) {
                return helper(arr, target);
            }
        }

        return false;
    }

    public boolean helper(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return false;
    }
}

