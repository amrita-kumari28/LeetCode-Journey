class Solution {
    public int gcdOfOddEvenSums(int n) {
        int count=0;
        int sumOdd=0,sumEven=0;
        for(int i=1;i<=1000;i++){
            while(count!=n){
                if(i%2==0){
                    sumEven+=i;
                    count++;
                }
                else{
                    sumOdd+=i;
                    count++;
                }
            }
        }
        return gcd(sumOdd,sumEven);
    }
    private int gcd(int a, int b){
        return (b==0)?Math.abs(a):gcd(a,a%b);
    }
}