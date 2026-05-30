class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //binary search on the first element of the subarr
        //binary search in that arr

        // rowLeft = 0;
        // rowRight = matrix.length - 1;
        // rowMid = (rowLeft+rowRight) / 2;
        int rowLeft = 0;
        int rowRight = matrix.length - 1;
        int rowToSearch = -1;
        

        while (rowLeft <= rowRight) {
            int rowMid = (rowLeft + rowRight) / 2;

            if (matrix[rowMid][0] <= target) {
                rowToSearch = rowMid;
                rowLeft = rowMid +1;
            }
            else{
                // check earlier rows
                rowRight = rowMid - 1;
            }
        }


        if (rowToSearch == -1) return false;


        //found row now perform binary search

        int colLeft = 0;
        int colRight = matrix[rowToSearch].length - 1;


        while(colLeft <= colRight) {
            int colMid = (colLeft + colRight) / 2;

            if(target == matrix[rowToSearch][colMid]) {
                return true;
            }
            else if(target > matrix[rowToSearch][colMid]) {
                colLeft = colMid + 1;
            }
            else{
                colRight = colMid - 1;
            }
        }


        return false;






        
    }
}
