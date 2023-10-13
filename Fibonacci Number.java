class Solution {
    public int fib(int n) {                        
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
        
    }
}
/*
Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
TC: O(2^n)
each recursive call, it makes two more recursive calls, leading to an exponential growth in the number of function calls.
SC:O(N) function calls waiting on the call stack.

*/
