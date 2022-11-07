/* Q 48. Rotate Image

        You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

        You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

class Solution {
    public void rotate(int[][] matrix) {
        
        int i,j,temp;
        int n = matrix.length;
        
        // Transpose of the matrix 
        
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Swap the matrix
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n/2;j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}