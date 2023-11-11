class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if((map1.containsKey(a)&&map1.get(a)!=b)||(map2.containsKey(b)&&map2.get(b)!=a)){
                return false;
            }
            map1.put(a,b);
            map2.put(b,a);
        }
        return true;
        
    }
}
/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
*/
