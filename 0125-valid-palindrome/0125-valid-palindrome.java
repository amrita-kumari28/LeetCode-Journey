class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String str=new StringBuilder(s).reverse().toString();
        return str.equals(s);
    }
}