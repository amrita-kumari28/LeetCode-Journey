class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        if(n==1){
            return true;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set= new HashSet<>(map.values());
        return set.size()==map.size();
    }
}