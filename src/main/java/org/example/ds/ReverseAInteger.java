package org.example.ds;

public class ReverseAInteger {
    public int reverse(int x) {
        int res=0;
        int i=0;
        while(Math.abs(x)>0){
            if(res>(Integer.MAX_VALUE/10) || res<(Integer.MIN_VALUE/10)){
                return 0;
            }
            int rem=x%10;
            res=res*10+rem;
            x=x/10;
        }
        return res;
    }
}
