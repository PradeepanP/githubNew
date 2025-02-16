class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0, bottom = n-1;
        int left = 0, right = n -1;
        int[][] matrix = new int[n][n];
        int i = 1;
        while(i <= n*n && (top <= bottom && left <= right)){
            for(int j = left; j <= right; j++){
                matrix[top][j] = i;
                i++;
            }
            top++;
            for(int j = top; j <= bottom; j++){
                matrix[j][right] = i;
                i++;
            }
            right--;
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    matrix[bottom][j] = i;
                    i++;
                }
                bottom--;
            }
            if(left <= right){
                for(int j = bottom; j >= top; j--){
                    matrix[j][left] = i;
                    i++;
                }
                left++;
            } 
        }
    return matrix;
    }
}