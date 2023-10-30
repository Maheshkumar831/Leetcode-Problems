class Solution {
    static boolean isAlphanumeric(char ch){
        if((ch>='0' && ch<='9')||(ch>='A'&& ch<='Z')||(ch>='a' && ch<='z')){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPalindrome(String s) {
        int n=s.length();
        String str="";
        String str2="";
        s=s.toLowerCase();
        for(int i=0;i<n;i++){
            if(isAlphanumeric(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(isAlphanumeric(s.charAt(i))){
                str2+=s.charAt(i);
            }
        }
       if(str.equals(str2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
