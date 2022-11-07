/* Q 796. Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example:

Input: s = "abcde", goal = "cdeab"
Output: true                         */

class Solution {
    public boolean rotateString(String s, String goal) {
        
        int i,len;
        String front,temp;
        
        len = s.length();
        
        for(i=0;i<len;i++)
        {
            if(s.equals(goal))
            {
                return true;
            }
            
            temp = s.substring(len-1);
            front = s.substring(0,len-1);
            
            s = temp + front;
        }
        return false;
    }
}