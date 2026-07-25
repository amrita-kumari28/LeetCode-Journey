class Solution {
    public int maxProduct(int n) {
        int temp=n;
        int digit=0;
        while(temp>0){
            digit++;
            temp=temp/10;
        }
        int arr[]=new int[digit];
        int i=0;
        while(n>0){
            int digits=n%10;
            arr[i++]=digits;
            n/=10;
        }
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int x:arr){
            //if(first==x || second==x) continue;
            if(x>first){
                second=first;
                first=x;
            }
            else if(x>second){
                second=x;
            }
        }
        return first*second;
    }
}