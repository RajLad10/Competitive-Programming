/* 
Q 350. Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both 
arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2] 
*/

class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        
        vector<int> ans;
        int n1=nums1.size();
        int n2=nums2.size();
        int i=0,j=0;
        
        sort(nums1.begin(),nums1.end());
        sort(nums2.begin(),nums2.end());
        
        while(i<n1 && j<n2)
        {
            if(nums1[i]==nums2[j])
            {
                ans.push_back(nums1[i]);
                nums1[i]=-1;
                nums2[j]=-1;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
        }
        return ans;
    }
};