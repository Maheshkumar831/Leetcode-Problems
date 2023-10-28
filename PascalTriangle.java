class Solution {
    static int factNum(int n,int r){//
        int ans=1;
        for(int i=0;i<r;i++){//0<0..0<0.0<1
            ans=ans*(n-i);//1*(1-0)=1...1*(2-0)=2
            ans=ans/(i+1);//1/1=1.......2/1=2
        }
        return ans;//1..1,1..1,2,1
    }
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>>list=new ArrayList<>();
       int n=numRows;
       for(int i=1;i<=n;i++){
           List<Integer>temp=new ArrayList<>();
           for(int j=1;j<=i;j++){
               temp.add(factNum(i-1,j-1));//0,0..1,1....2,0.2,1.2,2.
           }
           list.add(temp);
       }
       return list;
       
        
    }
}
/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/
