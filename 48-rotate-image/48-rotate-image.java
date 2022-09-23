class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] temp=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[i][j]=matrix[matrix.length-j-1][i];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=temp[i][j];
            }
        }        
    }
} 