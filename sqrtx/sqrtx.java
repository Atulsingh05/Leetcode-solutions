class Solution 
{
    public int mySqrt(int x)
    {
        if(x<=1)return x;
        int low=1;
        int high=x/2;
        while(low<=high)
        {
            int mid=low+(high-low+1)/2;//rounding up since decimal part not allowed
            int t=x/mid;
            if(mid==t)
                return mid;
            else if(mid>t) //mid left
                high=mid-1; 
            else //mid<t
                low=mid+1;//mid right
        }
        return high;
    }
}