class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max=Integer.MIN_VALUE;
        int rows = mat.length;
        int cols= mat[0].length;
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               int up = -1;
               if(i>0){
                up=mat[i-1][j];
               }
               int down = -1;
               if(i+1<rows){
                down=mat[i+1][j];
               }
               int left=-1;
               if(j>0){
                left=mat[i][j-1];
               }
               int right=-1;
               if(j+1<cols){
                right=mat[i][j+1];
               }
               if(mat[i][j]>up && mat[i][j]>down && mat[i][j]>left && mat[i][j]>right){
                return new int[]{i,j};
               }
            }
        }
        return new int[]{-1,-1};
        
    }
}