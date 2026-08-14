class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left1=0,left2=0,i=0;
        int ans[]=new int[m+n];
        while(left1<m && left2<n){
            if(nums1[left1]<nums2[left2]){
                ans[i++]=nums1[left1++];
            } else {
                ans[i++]=nums2[left2++];
            }
        }
        while(left1<m){
            ans[i++]=nums1[left1++];
        }
        while(left2<n){
            ans[i++]=nums2[left2++];
        }
        i=0;
        for(int x:ans){
            nums1[i++]=x;
        }
    }
}