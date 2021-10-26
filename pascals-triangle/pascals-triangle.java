class Solution {
    public List<List<Integer>> generate(int numRows)
    {
        //list of list which define the result
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //list which define the present row
        //and list which define the previous row.
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i)
        {
      //everytime you visit a new row you initialised with empty arraylist.
			row = new ArrayList<Integer>();
           
			for (int j = 0; j <= i; ++j)//loops for no of columns
				if (j == 0 || j == i)//if it is 1 col or last col answer will be 1.
					row.add(1);
				else//if it is not 1 col or last col
					row.add(pre.get(j - 1) + pre.get(j));//then it was prev j-1 +prev j
			pre = row;//initialising this row to previous so to used in next iteration.
			res.add(row);//then we add current row to result
		}
		return res;//once it is done then we return result.
    }
}