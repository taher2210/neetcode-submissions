class Solution {
    public static double helper(double x, int n){
        if(n == 1){
            return x *n;
        }
        if(n == 0){
            return 1;
        }
        return  x * helper(x,n-1);
    }
    public double myPow(double x, int n) {
        double result = helper(x, Math.abs(n));
        if(n > 0){
            return result;
        }
        return 1/result;
}
}