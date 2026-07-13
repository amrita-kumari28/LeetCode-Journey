class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[Math.min(nums1.length,nums2.length)];
        for(int x:nums1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int i=0;
        for(int x:nums2){
            if(map.containsKey(x) && map.get(x)>0){
                arr[i]=x;
                map.put(x,map.get(x)-1);
                i++;
            }
        }
        return Arrays.copyOf(arr,i);
    }
}