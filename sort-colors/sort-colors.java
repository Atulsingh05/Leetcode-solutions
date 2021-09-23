class Solution 
{
    public void sortColors(int[] nums)
    {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp;
        while(mid<=high)//loop tb tk cahlega jab tak mid high ke bvarabar nhi ho jata .
        {
            switch(nums[mid])//nums[2]=1 hua to case 1 pe chala jayega.
            {
                case 0:
                    {
                        temp=nums[low];
                        nums[low]=nums[mid];
                        nums[mid]=temp;
                        low++;
                        mid++;
                        break;
                    }
                case 1:
                    mid++;
                    break;
                case 2:
                    {
                        temp=nums[mid];
                        nums[mid]=nums[high];
                        nums[high]=temp;
                        high--;
                        break;
                    }
            }
        }
    }
}