/* Q 20. Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example:

Input: s = "()[]{}"
Output: true
*/

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        if(s.length() <= 1)
            return false;
        
        for(int i=0;i<s.length();i++)
        {
                if(!(stack.empty()))
                {
                    if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                    {
                        stack.push(s.charAt(i));
                        continue;
                    }
                    else if(s.charAt(i) == ')' )
                    {
                        if(stack.peek() == '(' )
                        {
                            stack.pop();
                            continue;
                        }
                    }
                    else if(s.charAt(i) == '}' )
                    {
                        if(stack.peek() == '{' )
                        {
                            stack.pop();
                            continue;
                        }
                    }
                    else if(s.charAt(i) == ']' )
                    {
                        if(stack.peek() == '[' )
                        {
                            stack.pop();
                            continue;
                        }
                    }
                }
            
            stack.push(s.charAt(i));
        }
        System.out.println(stack);
        if(stack.empty())
            return true;
        else
            return false;
    }
}