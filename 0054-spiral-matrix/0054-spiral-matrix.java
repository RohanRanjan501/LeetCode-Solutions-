public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        
        int rowstart = 0;
        int rowEnd = matrix.length-1;
        int colstart = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowstart <= rowEnd && colstart <= colEnd) {
            // Traverse Right
            for (int j = colstart; j <= colEnd; j ++) {
                res.add(matrix[rowstart][j]);
            }
            rowstart++;
            
            // Traverse Down
            for (int j = rowstart; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowstart <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colstart; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colstart <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowstart; j --) {
                    res.add(matrix[j][colstart]);
                }
            }
            colstart ++;
        }
        
        return res;
    }
}