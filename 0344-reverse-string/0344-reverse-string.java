class Solution {
    public void reverseString(char[] s) {
        // //2 pointer approach 
        // int left=0;
        // int right=s.length-1;
        // while(left<=right){
        //     char temp=s[left];
        //     s[left]=s[right];
        //     s[right]=temp;
        //     left++;
        //     right--;
        // }



        //using string builder
        StringBuilder ans=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            ans.append(s[i]);
        }
        int i=0;
        for(char ch:ans.toString().toCharArray()){
            s[i++]=ch;
        }

    }
}