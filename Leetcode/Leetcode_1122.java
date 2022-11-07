/*Q 1122. Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end 
of arr1 in ascending order.

Example:

Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]
 */ 

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int i,j,k=0,temp,count=0;
        
        for(i=0;i<arr2.length;i++)
        {
            for(j=0;j<arr1.length;j++)
            {
                if(arr2[i] == arr1[j])
                {
                    temp = arr1[j];
                    arr1[j] = arr1[k];
                    arr1[k] = temp;
                    k++;
                    count++;
                }
            }
        }
        Arrays.sort(arr1, count, arr1.length);
        return arr1;
    }
}