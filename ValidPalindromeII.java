import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();//abcbea
        boolean res=validPalindrome(s);
        if(res==true)System.out.println("Valid Palindrome");
        else System.out.println("Not a valid Palindrome");
    }
    static boolean validPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))return isPalindrome(s,start+1,end)||isPalindrome(s,start,end-1);
            start++;
            end--;
        }
        
        return true;
        
    }
    static boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/*
abecba
Valid Palindrome

abcbea
Valid Palindrome*/










Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
