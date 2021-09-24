class Solution {
    public double myPow(double x, int n) {
      
        double ans=1.0;
        long nn=n;
        if(nn<0) nn=-1*nn;//agar nn negative h to use positive bana do.
        while(nn>0)
        {
            if(nn%2==1)//if nn  is odd
            {
                ans=ans*x;
                nn=nn-1;
            }
            else//if nn is even.
            {
                x=x*x;
                nn=nn/2;
            }
        }
        if(n<0) ans=(double)(1.0) / (double)(ans);//return 1/x^n;
        return ans;
    }
}
