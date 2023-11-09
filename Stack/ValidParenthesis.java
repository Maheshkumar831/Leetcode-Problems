class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<Character>();
        for(char i:s.toCharArray()){
            if(i=='('||i=='{'||i=='['){
                st.push(i);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch=st.pop();
                if((i==')'&& ch=='(')||(i=='}'&& ch=='{')||(i==']'&& ch=='['))
                    continue;
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------
  /*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
  */
