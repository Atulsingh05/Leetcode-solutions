class Solution
{
    public int search(int[] nums, int target) 
    {
      int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high) >>1;
            if(nums[mid]==target) return mid;
            
            //the left side is sorted
            
            if(nums[low]<=nums[mid])
            {
                if(target>=nums[low] && target<=nums[mid])//figure out if elemnt lie on right half or not
                {
                    high=mid-1;
                }
                else//elminate the left half and low=mid+1
                {
                    low=mid+1;
                }
            }
            else
            {
                 //if right is sorted.
                //if target appears on right half than low=mid+1
                if(target>=nums[mid] && target<=nums[high])
                {
                    low=mid+1;
                }
                else//if not apppers on right half elminate right half and high=mid-1
                {
                    high=mid-1;
                }
                 }

                    

            }
        return -1;

    }
}