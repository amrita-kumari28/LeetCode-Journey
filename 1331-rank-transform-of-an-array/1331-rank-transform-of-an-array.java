class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sort=new int[arr.length];
        int i=0;
        for(int x:arr){
            sort[i++]=x;
        }
        Arrays.sort(sort);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:sort){
            if(!map.containsKey(x)){
                map.put(x,rank);
                rank++;
            }
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=map.get(arr[j]);
        }
        return arr;
    }
}