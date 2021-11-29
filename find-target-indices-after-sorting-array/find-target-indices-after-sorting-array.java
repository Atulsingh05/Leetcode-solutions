class Solution
{
    public List<Integer> targetIndices(int[] nums, int target)
    {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();//initialising array list
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == target)//if num[i]==target add to the list
                list.add(i);
        return list;//at last retun list
    }
}