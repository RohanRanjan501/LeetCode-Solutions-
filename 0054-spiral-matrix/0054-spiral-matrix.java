class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();
            if(matrix == null || matrix.length == 0) 
                return result;   
        
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int direction = 0;
    
    while(rowStart <= rowEnd && colStart <= colEnd) {
        switch(direction) {      
            case 0:   
                for(int j = colStart; j <= colEnd; j++)           //Right
                    result.add(matrix[rowStart][j]);
                rowStart++;
                break;
            case 1:                                              //Down
                for(int j = rowStart; j <=rowEnd; j++) 
                    result.add(matrix[j][colEnd])    ;
                colEnd--;
                break;
            case 2:
                for(int j = colEnd; j >= colStart; j --)          //Left
                    result.add(matrix[rowEnd][j]);            
                rowEnd--;
                break;
            case 3:
                for(int j = rowEnd; j >= rowStart; j--)           //up
                    result.add(matrix[j][colStart]);
                colStart++;  
                break;
        }                                   
        direction = (direction+1)%4;                                                            
    }   
    return result;      
    }
}