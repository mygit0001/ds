package org.example.problems;

public class IsPalindrome {
    public int reverse(int x){
        int res=0;
        int i=0;
        while(x>0){
            int rem=x%10;
            res=res*10+rem;
            x=x/10;
        }
        return res;
    }

    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0))
            return false;
        if(x<10 || x==reverse(x)){
            return true;
        }else
            return false;
    }
}
