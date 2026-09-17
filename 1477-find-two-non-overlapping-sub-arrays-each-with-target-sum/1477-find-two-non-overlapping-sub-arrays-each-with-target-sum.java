class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int res=arr.length+1, sum=0, i=0;
        int[] dp=new int[arr.length+1];
        Arrays.fill(dp,arr.length);
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            while(sum>target)
            sum-=arr[i++];
            dp[j+1]=dp[j];
            if(sum==target){
                res=Math.min(res,j-i+1+dp[i]);
                dp[j+1]=Math.min(dp[j],j-i+1);
            }
        }
        return res==arr.length+1?-1:res;
    }
}