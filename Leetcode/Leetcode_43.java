/* 
Q 43. Multiply Strings

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example:

Input: num1 = "2", num2 = "3"
Output: "6"
*/

class Solution {
    public String multiply(String num1, String num2) {
        
        long n1=0,n2=0;
        long n11=0,n22=0;
        
        long mult;
        
        if(num1 == "0" || num2 == "0")
        {
            return "0";
        }
        
            for(int i = num1.length()-1,j=0; i>=0 ;i--,j++)
            {
                n1 = num1.charAt(i) - '0';
                
                if(num1.length() > 1)
                    n11 += n1 * Math.pow(10,j);
                else
                    n11 = n1;
            }

            for(int i = num2.length()-1,j=0; i>=0 ;i--,j++)
            {
                n2 = num2.charAt(i) - '0';

                if(num2.length() > 1)
                    n22 += n2 * Math.pow(10,j);
                else
                    n22 = n2;
            }
        
        mult = n11 * n22;
        
        String ans = Long.toString(mult);
        return ans;
    }
}