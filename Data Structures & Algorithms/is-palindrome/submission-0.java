class Solution {
    public boolean isPalindrome(String s) {
    String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = result.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(j>i){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
