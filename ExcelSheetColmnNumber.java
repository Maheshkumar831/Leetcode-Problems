class Solution {
    public int titleToNumber(String columnTitle) {
        String str=columnTitle;
        int sum=0;
        for(char ch:str.toUpperCase().toCharArray()){//ZY
            sum*=26;//0,,26*26=676
            sum+=ch-'A'+1;//90-65=25+1=26,676+=25=701

        }
        return sum;
        
    }
}
