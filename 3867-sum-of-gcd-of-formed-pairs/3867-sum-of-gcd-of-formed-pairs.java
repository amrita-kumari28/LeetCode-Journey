class Solution {
    public long gcdSum(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int[] prefixGcd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            mx=Math.max(nums[i],mx);
            prefixGcd[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefixGcd);
        int left=0,right=prefixGcd.length-1;
        long sum=0;
        while(left<right){
            sum+=(long)gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;
        }
        return sum;
    }
    private int gcd(int a,int b){
        return (b==0)?Math.abs(a):gcd(b,a%b);
    }
}