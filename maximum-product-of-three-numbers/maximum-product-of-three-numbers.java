//In a sorted array, the maximum product will be either the last three largest elements first  or the two (negative elements) multiplied by the last (largest) element.

class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int len = nums.length;
        
        return Math.max(nums[0]*nums[1]*nums[len-1], nums[len-1] * nums[len-2] * nums[len-3]);
    }
}