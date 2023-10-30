class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str1=String.valueOf(ch1);
        String str2=String.valueOf(ch2);
        if(str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    
    }
}

        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*String s1=new StringBuilder(); 
        String s2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            s1.append(s.charAt(i));

        }
        for(int i=0;i<t.length();i++){
            s2.append(t.charAt(i));
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
        return -1;
        
    }
}
*/
