class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for(int num=1;num<nums.length;num++){
            sum[num] = sum[num-1]+nums[num];
        }
        return sum;
    }
}