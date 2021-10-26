class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if(matrix.length == 0) return false;//if matrix is empty return false.
        int n = matrix.length; 
        int m = matrix[0].length; 
      //  int lo=0;
        int hi = (n * m) - 1;
        //applying binary search.
        while(lo <= hi) 
        {
            int mid = (lo + (hi - lo) / 2);
            //if imaginary index is equivalent to the      
                //target return true.
            if(matrix[mid/m][mid % m] == target)
            {
                return true;
            }
            //if imaginary index is less to the      
                //target.
            if(matrix[mid/m][mid % m] < target)
                
            {
                lo = mid + 1;
            }
            //if(matrix[mid/m][mid % m] > target)
            else  
            {
                hi = mid - 1;
            }
        }
        return false;//if low crosses high and the elemnt is not found we return false.
    }
}