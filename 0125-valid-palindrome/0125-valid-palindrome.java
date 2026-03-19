class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                ans+=ch;
            }
        }
        ans=ans.toLowerCase();
        int start=0;
        int end=ans.length()-1;
        while(start<=end){
            if(ans.charAt(start)!=ans.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
       
   }
}