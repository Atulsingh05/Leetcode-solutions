class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;//we set column is equals to true.
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) 
        {
            if (matrix[i][0] == 0) col0 = 0;//if any member 0th column is zero
            //then mark col0 as false. 
            // agar 0 elemnt encounter krte h  to dummy array(row) me 0 mark karo aur dummy array(col) mein bhi 0 mark karo.
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
          //traversal from last elemt of last row a and last column.
        //agar 1 hai to 0 mark kardo
        for (int i = rows - 1; i >= 0; i--) 
        {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
}