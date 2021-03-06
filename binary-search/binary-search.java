class Solution 
{
    public int search(int[] nums, int target)
    {
        return bSearch(nums, 0, nums.length-1,target);
    }
    public int bSearch(int[] nums, int low, int high, int target)
    {
       
       
      if(low>high)
      {
          return -1;
      }
        int mid=low+(high-low)/2;
        
        if(nums[mid]==target) 
        {
            return mid;
        }
        else if(nums[mid]>target)          //search on left side
        {
            return bSearch(nums,low,mid-1,target);
        }
        else                          //search on RHS
        {
           return bSearch(nums,mid+1,high,target);
        }
    }
}