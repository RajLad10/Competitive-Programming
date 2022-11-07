/* 
Q 350. Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both 
arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2] 
*/

import java.lang.*;
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int i=0,j=0,n=0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        int l = len1>len2?len2:len1;
        
        int temp[] = new int[l];
        
        
        for(i=0;i<len1;i++)
        {
            for(j=0;j<len2;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    temp[n++] = nums1[i];
                    nums1[i]=-1;
                    nums2[j]=-1;
                    break;
                }
            }   
        }
        
        int[] result = new int[n];
        
        for(i=0;i<n;i++)
        {
            result[i] = temp[i];
        }
        return result;

    }
}