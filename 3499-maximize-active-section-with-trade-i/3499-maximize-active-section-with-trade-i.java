class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        int currentOne=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') currentOne++;
        }
        s="1"+s+"1";
        if(n<=2) return currentOne;
        ArrayList<Character> type=new ArrayList<>();
        ArrayList<Integer> len=new ArrayList<>();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                type.add(s.charAt(i-1));
                len.add(count);
                count=1;
            }
        }
        type.add(s.charAt(s.length()-1));
        len.add(count);
        int ans=currentOne;
        for(int i=1;i<type.size()-1;i++){
            if(type.get(i)=='1' && type.get(i-1)=='0' && type.get(i+1)=='0'){
                int mergedzero=len.get(i-1)+len.get(i)+len.get(i+1);
                int finalOne=currentOne-len.get(i)+mergedzero;
                ans=Math.max(ans,finalOne);
            }
        }
        return ans;
    }
}