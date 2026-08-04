class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int x:nums){
            list1.add(x);
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        for(int i=min;i<=max;i++){
            if(!list1.contains(i)) list2.add(i);
        }
        return list2;
    }
}