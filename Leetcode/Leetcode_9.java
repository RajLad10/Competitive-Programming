/* Q 9. Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not. */

class Solution {
    public boolean isPalindrome(int x) {
        
        int i,count=0;
        String str = Integer.toString(x);
        int len = str.length();
        
        if(x < 0)
        {
            return false;
        }
        
        for(i=0;i<len/2;i++)
        {
            if(str.charAt(i) == str.charAt(len-i-1))
            {
                count++;
            }
        }
        
        if(count == len/2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}