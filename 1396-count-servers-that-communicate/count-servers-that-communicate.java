class Solution {
    public int countServers(int[][] grid) {
        int n = grid[0].length;
        int m = grid.length;
        int[] rows= new int[m];
        int[] col = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    rows[i]++;
                    col[j]++;
                }
            }
        }
        int result =0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1 && (rows[i] > 1 || col[j]>1)){
                    result++;
                }
            }
        }
        return result;
    }
}