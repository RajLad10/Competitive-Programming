/* Q 118. Pascal's Triangle
        Given an integer numRows, return the first numRows of Pascal's triangle.

        In Pascal's triangle, each number is the sum of the two numbers directly above it.

        Example:

        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

class Solution {
    public List<List<Integer>> generate(int n) {
        
        int i,j,add;
        
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        
        for(i=0;i<n;i++)
        {
            List<Integer> temp = new ArrayList<Integer>();
            
            for(j=0;j<i+1;j++)
            {
                if(j == 0 || j == i)
                {
                    temp.add(1);
                }
                else
                {
                    List<Integer> prev = list.get(i-1);
                    
                    add = prev.get(j-1) + prev.get(j);
                    temp.add(add);
                }
            }
            list.add(temp);
        }
        return list;
    }
}