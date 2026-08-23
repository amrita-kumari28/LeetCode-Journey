class Solution {
    public boolean sumGame(String num) {
        int leftsum=0;
        int rightsum=0;
        int qleft=0,qright=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?')
            qleft++;
            else
            leftsum+=num.charAt(i)-'0';
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?')
            qright++;
            else
            rightsum+=num.charAt(i)-'0';
        }
        return 2*(leftsum-rightsum) != 9*(qright-qleft);
    }
}