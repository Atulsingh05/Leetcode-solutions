class Solution
{
    public int missingNumber(int[] nums)
    {
       Set<Integer> as=new HashSet<Integer>();
        for(int num:nums) 
        {
            as.add(num);//adding all the array elmnt to hash table.
        }
        int expectedNumCount=nums.length+1;
        for(int i=0;i<expectedNumCount;i++)
        {
            if(!as.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}