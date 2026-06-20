class Solution {
    public boolean checkGoodInteger(int n) {
        int sum1=0;
        int sum2=0;
        while(n>0){
            int digit=n%10;
            sum1=sum1+digit;
            sum2=sum2+digit*digit;
            n=n/10;
        }
        int diff=sum2-sum1;
        if(diff>=50){
            return true;
        }
        else{
            return false;
    }
        
        
    }
    
}