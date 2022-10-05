package com.company.GraphAlgorithm;

public class FloodFill {
    int[][] image;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        if (color != image[sr][sc]) dfs(sr, sc, color, image[sr][sc]);
        return image;
    }

    public void dfs(int sr, int sc, int color, int orginalColor) {
        if (sr < 0 || sc < 0 || sr == image.length || sc == image[0].length) return;
        if (image[sr][sc] == orginalColor) {
            image[sr][sc] = color;
            dfs(sr - 1, sc, color, orginalColor);
            dfs(sr + 1, sc, color, orginalColor);
            dfs(sr, sc + 1, color, orginalColor);
            dfs(sr, sc - 1, color, orginalColor);
        } else {
            return;
        }

    }

}
