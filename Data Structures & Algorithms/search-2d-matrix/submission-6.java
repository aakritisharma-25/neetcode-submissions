class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // if(matrix.length==0 || matrix[0].length==0)return false;
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=n*m-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/m;
            int cols=mid%m;
            int value=matrix[row][cols];
            if(value==target)return true;
            else if(value<target)left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}
