class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[] arr=new int[m*n];
        int i=0;
        for(int[] row:grid){
            for(int x:row){
                arr[i++]=x;
            }
        }
        k=k%arr.length; //to handle if k is larger than arr length
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        List<List<Integer>> ans=new ArrayList<>();
        int idx=0;
        for(int a=0;a<m;a++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(arr[idx++]);
            }
            ans.add(row);
        }
        return ans;
    }
    private static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}