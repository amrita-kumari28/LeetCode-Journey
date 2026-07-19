class Solution {
    public double average(int[] salary) {
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        for(double x:salary){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        double sum=0;
        for(double x:salary){
            sum+=x;
        }
        sum=sum-max-min;
        return sum/(salary.length-2);
    }
}