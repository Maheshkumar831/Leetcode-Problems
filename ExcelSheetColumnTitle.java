class Solution {
    public String convertToTitle(int columnNumber) {
        String str="";
        while(columnNumber>0){//28
            columnNumber--;//27
            str=(char)(columnNumber%26+'A')+str;//1+65=66=B
            columnNumber/=26;
            
        }
        return str;
        
    }
}
/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
 */
