class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        return gcd(min,max);
    }
    private int gcd(int a , int b){
        return (b==0)?Math.abs(a):gcd(b,a%b);
    }
}