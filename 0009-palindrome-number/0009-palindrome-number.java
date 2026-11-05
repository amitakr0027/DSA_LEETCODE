class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ans=0;
        int org=x;
        while(x>0){
            int num=x%10;
            ans=10*ans+num;
            x=x/10;
        }
        return org==ans;
    }
}