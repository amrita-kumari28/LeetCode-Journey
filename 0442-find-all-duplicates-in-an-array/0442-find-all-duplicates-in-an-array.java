class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int x:nums){
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int x:map.keySet()){
        //     if(map.get(x)==2){
        //         list.add(x);
        //     }
        // }
        // return list;
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:nums){
            int idx=Math.abs(x)-1;
            if(nums[idx]<0) list.add(Math.abs(x));
            else nums[idx] *= -1;
        }
        return list;
    }
}