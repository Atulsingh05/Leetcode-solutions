class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        List<int[]> res=new ArrayList<>();
        if(intervals.length==0 || intervals==null)
            return res.toArray(new int[0][]);//return empty interval.
         
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);//sort in ascending order
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        
        for(int[] i:intervals)//iterate in intervals.
        {
            if(i[0]<= end)//merging if the lie in the interval
            {
                end=Math.max(end,i[1]);
            }
            else//if they not lie in the interval just put in arraylist 
            {
                res.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        res.add(new int[]{start,end});//after merging is over the left over interval is added to the array list
        return res.toArray(new int[0][]);//after we convert it to array and return it.
    }
}