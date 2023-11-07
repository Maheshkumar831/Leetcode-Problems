lass Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int mid=n/2;
        int sum=0;
        for(int i=0;i<n;i++){              //optimal appraoch  TC:O(N) SC:O(1)
            sum+=mat[i][i]+mat[i][n-i-1];
        }
        if(n%2==1){
            sum-=mat[mid][mid];
        }
        return sum;
        }

}

----------------------------------------------------------------------------------------------------------------------------------------------
       int n=mat.length;          //Brute force approach  TC:O(N)  SC:O(1)
       int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=mat[i][j];

                }
                else if(i+j==n-1){
                    sum+=mat[i][j];
            
                }
            }
        }
        //1 4 9 16 25 
        System.out.println(sum);
        if(!(n%2==0)){
            sum-=mat[mid][mid];
        }
        return sum;
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------
/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part 
of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5
 
*/
