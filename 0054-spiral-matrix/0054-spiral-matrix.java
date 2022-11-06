class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>(); 
        if (matrix.length == 0) {
            return res;
        }
        
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int direction = 0;
    
    while(rowStart <= rowEnd && colStart <= colEnd) {
        switch(direction) {      
            case 0:   
                for(int j = colStart; j <= colEnd; j++)           //Right
                    res.add(matrix[rowStart][j]);
                rowStart++;
                break;
            case 1:                                              //Down
                for(int j = rowStart; j <=rowEnd; j++) 
                    res.add(matrix[j][colEnd])    ;
                colEnd--;
                break;
            case 2:
                for(int j = colEnd; j >= colStart; j --)          //Left
                    res.add(matrix[rowEnd][j]);            
                rowEnd--;
                break;
            case 3:
                for(int j = rowEnd; j >= rowStart; j--)           //up
                    res.add(matrix[j][colStart]);
                colStart++;  
                break;
        }                                   
        direction = (direction+1)%4;                                                            
    }   
    return res;      
    }
}