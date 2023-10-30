class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str="";
        for(String w:words){
            str+=w.charAt(0);
            
        }
        if(str.equals(s)){
            return true;
        }
        return false;
}
