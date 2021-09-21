class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
         int res[] = new int[nums.length];
        int i = 0;
        int k = nums.length - 1;//4
        int z = nums.length - 1;//4
        while(z >= 0){ 
            res[z--] = Math.abs(nums[i]) > Math.abs(nums[k]) ? nums[i] * nums[i++] : nums[k] * nums[k--];
        }
        return res;
    }
}