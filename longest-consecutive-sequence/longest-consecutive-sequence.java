class Solution
{
    public int longestConsecutive(int[] nums)
    {
        Set<Integer> hs =new HashSet<Integer>();
        for(int num:nums)//traversing the array and adding elemnt to hashset
        {
           hs.add(num); 
        }
        int longestStreak=0;
        for(int num:nums)
            //linearly traverse the array and check if number -1 exist in set or           not             if it exist jump to next number . 
            //if it not exist then check if current numbert+1 exist or not.
        {
            if(!hs.contains(num-1))
            {
                //code for  num-1 not exist in set.
                int currentNum=num;
                int currentStreak=1;
                
                while(hs.contains(currentNum+1))
                {
                    currentNum=currentNum+1;
                    currentStreak=currentStreak+1;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return  longestStreak;
    }
}