class Solution {
    public boolean isPalindrome(int x) {
      int rn=0;
      int dup=x;
      while(x>0){
        int ld=x%10;
        rn=(rn*10)+ld;
        x=x/10;
      }
      if(dup==rn){
        return true;
      }else{
        return false;
      }  
    }
}