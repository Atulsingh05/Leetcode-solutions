class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int sum=0;
        //find the contiguous subarray (containing at least one number)
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}