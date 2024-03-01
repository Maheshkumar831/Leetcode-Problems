class Solution {
    public boolean wordPattern(String pattern, String s) {
     
        String words[]=s.split(" ");
        char ch[]=pattern.toCharArray();
        if(words.length!=ch.length)return false;
        HashMap<Character,String> map=new HashMap();
        for(int i=0;i<words.length;i++){
            boolean keyPresent=map.containsKey(ch[i]);
            if(keyPresent && !(map.get(ch[i]).equals(words[i]))){
                return false;
            }
            if(!keyPresent && map.containsValue(words[i])){
                return false;
            }
            
            else{
                map.put(ch[i],words[i]);
            }
        }
        return true;
        
    }
}

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.*/
