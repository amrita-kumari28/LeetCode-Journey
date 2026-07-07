class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n).replaceAll("0","");
        if(s==""){
            return 0;
        }
        int x=Integer.parseInt(s);
        int sum=0;
        for(char ch:s.toCharArray()){
            sum+=ch-'0';
        }
        return (long)x*sum;
        
    }
}