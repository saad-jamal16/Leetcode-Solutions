class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> list = new ArrayList<>();
        int n = heights.length,m=heights[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0) && !pacific[i][j])dfs(i,j,heights,pacific);
                if((i==n-1 || j==m-1) && !atlantic[i][j])dfs(i,j,heights,atlantic);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j])list.add(Arrays.asList(i,j));
            }
        }
        return list;
    }
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public void dfs(int startx,int starty,int[][] height,boolean[][] visited){
        if(startx<0 || starty<0 || startx>=height.length || starty>=height[0].length || visited[startx][starty])return;
        visited[startx][starty]=true;
        for(int i=0;i<4;i++){
            int nx = startx+dx[i],ny = starty+dy[i];
            if(nx>=0 && ny>=0 && nx<height.length && ny<height[0].length){
                if(height[nx][ny]>=height[startx][starty]){
                    dfs(nx,ny,height,visited);
                    visited[nx][ny]=true;
                }
            }
        }
    }
}