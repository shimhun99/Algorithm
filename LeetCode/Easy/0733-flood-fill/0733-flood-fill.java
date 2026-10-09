import java.util.*;

class Solution {
    // 우, 하, 좌, 상
    int[] dr = {0,1,0,-1};
    int[] dc = {1,0,-1,0};

    int n;
    int m;
    int originColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        n=image.length;
        m=image[0].length;

        // int n;
        // int m;
        // int visited[][];

        // image[sr][sc] = color

        // for(int r=0; r<n; r++){
        //     for(int c=0; c<m; c++){
        //         if(!visited[r][c] )
        //     }
        // }
        originColor = image[sr][sc];
        image[sr][sc] = color;
        bfs(image,sr,sc,color);
        
        return image;
    }

    void bfs(int[][] grid, int startR, int startC, int color){
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{startR, startC});
        // visited[r][c] = true;

        while(!q.isEmpty()){
            int[] cur = q.remove();
            int r = cur[0];
            int c = cur[1];

            for(int i=0; i<4; i++){
                int nr = dr[i]+r;
                int nc = dc[i]+c;
                // System.out.println(nr + " " + nc);

                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    // System.out.println("test");
                    System.out.println(grid[nr][nc] + " " + color);


                    if(grid[nr][nc] == originColor){
                        System.out.println("test");
                        grid[nr][nc] = color;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }
    }
}