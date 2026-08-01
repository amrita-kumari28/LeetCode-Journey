class Solution {
    public boolean predictTheWinner(int[] nums) {
       return play(nums,0,nums.length-1,0,0,true);
    }
    private boolean play(int[] nums,int left,int right,int p1score,int p2score,boolean p1turn){
        if(left>right){
            return p1score>=p2score;
        }
        if(p1turn){
            return play(nums,left+1,right,p1score+nums[left],p2score,false) || play(nums,left,right-1,p1score+nums[right],p2score,false);
        } else {
            return play(nums,left+1,right,p1score,p2score+nums[left],true) && play(nums,left,right-1,p1score,p2score+nums[right],true);
        }
    }
}