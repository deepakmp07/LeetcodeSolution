class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int result[][] = new int[r][c];
        if(m*n != r*c){
        return mat;
        }
        int p = 0;
        int q = 0;
         for(int i =0 ;i<m;i++){
             for(int j = 0;j<n;j++){
               result[p][q] = mat[i][j];
               q++;
               if(q==c){
                   p++;
                   q=0;
               }
             }
         }
        return result;
    }
}