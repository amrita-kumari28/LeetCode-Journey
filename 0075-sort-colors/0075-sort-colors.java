class Solution {
    public void sortColors(int[] nums) {
        // int left=0,right=nums.length-1;
        // int mid=0;
        // while(mid<=right){
        //     if(nums[mid]==0){
        //         int temp=nums[left]; nums[left]=nums[mid]; nums[mid]=temp;
        //         left++;mid++;
        //     } else if(nums[mid]==1){
        //         mid++;
        //     } else{
        //         int temp=nums[right]; nums[right]=nums[mid]; nums[mid]=temp;
        //         right--;
        //     }
        // }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int i=0;
        for(int a=0;a<3;a++){
            int b=map.getOrDefault(a,0);
            while(b-- >0){
                nums[i++]=a;
            }
        }
    }
}