class Solution {
    public int bitwiseComplement(int n) {
        String binary=tobinary(n);
        StringBuilder ans=new StringBuilder();
        for(char ch:binary.toCharArray()){
            if(ch=='0'){
                ans.append(1);
            }
            else{
                ans.append(0);
            }
        }
        return todecimal(ans.toString());
    }
    private int todecimal(String binary){
        int decimal=0;
        for(int i=0;i<binary.length();i++){
            decimal=decimal*2+(binary.charAt(i)-'0');
        }
        return decimal;
    }
    private String tobinary(int decimal){
        if ( decimal==0) return "0";
        StringBuilder binary=new StringBuilder();
        while(decimal>0){
            binary.append(decimal & 1);
            decimal=decimal>>1;
        }
        return binary.reverse().toString();

    }
}