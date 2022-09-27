class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7){
            return true;
        }
        if(n>0 && n<10){
            return false;
        }
        int y=sum(n,0);
        
        return isHappy(y);
    }
    public int sum(int n,int x){
        
        while(n>0){
            int rem=n%10;
            x+=rem*rem;
            n/=10;
            
        }
        return x;
    }
}