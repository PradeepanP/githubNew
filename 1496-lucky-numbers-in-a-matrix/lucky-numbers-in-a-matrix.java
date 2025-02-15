class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        
        int[] rowMin = new int[row];
        for(int i = 0; i < row; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < col ; j++){
                min = Math.min(min,matrix[i][j]);
            }
            rowMin[i] = min;
        }
        int[] colHigh = new int[col];
        for(int i = 0; i < col; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < row ; j++){
                max = Math.max(max,matrix[j][i]);
            }
            colHigh[i] = max;
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col ; j++){
                int currElement = matrix[i][j];
                if(currElement == rowMin[i] && currElement == colHigh[j]){
                    list.add(currElement);
                }
            } 
        }
        return list;
    }
}