/*  Q 73. Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.*/

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m,n,i,j,a=-1,b=-1;
        
        m = matrix.length;
        n = matrix[0].length;
        
        int[] tempRow = new int[m];
        int[] tempCol = new int[n];
        
        for(i=0;i<m;i++)
        {
            
            for(j=0;j<n;j++)
            {
                
                if(matrix[i][j] == 0)
                {
                    tempRow[i] = 1;
                    tempCol[j] = 1;
                    
                }
            }
        }
        
        for(i=0;i<m;i++)
        {
            if(tempRow[i] == 1)
            {
                for(j=0;j<n;j++)
                {
                    matrix[i][j] = 0;
                }
            }  
        }
        
        for(j=0;j<n;j++)
        {
            if(tempCol[j] == 1)
            {
                for(i=0;i<m;i++)
                {
                    matrix[i][j] = 0;
                }
            }  
        }
    }
}