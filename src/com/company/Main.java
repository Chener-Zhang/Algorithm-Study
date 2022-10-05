package com.company;

import com.company.GraphAlgorithm.FloodFill;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FloodFill FloodFill = new FloodFill();
        FloodFill.floodFill(new int[][]{{0, 2, 1}, {1, 1, 2}, {2, 5, 4}}, 1, 0, 9);

    }

    static ArrayList<ArrayList<Integer>> flood_fill(Integer pixel_row, Integer pixel_column, Integer new_color, ArrayList<ArrayList<Integer>> image) {
        // Write your code here.
        if (new_color != image.get(pixel_row).get(pixel_column))
            dfs(image, pixel_row, pixel_column, new_color, image.get(pixel_row).get(pixel_column));
        return image;
    }

    static void dfs(ArrayList<ArrayList<Integer>> image, Integer sr, Integer sc, Integer color, Integer orginalColor) {
        if (sr < 0 || sc < 0 || sr == image.size() || sc == image.get(0).size()) return;
        if (image.get(sr).get(sc) == orginalColor) {
            image.get(sr).set(sc, color);
            dfs(image, sr - 1, sc, color, orginalColor);
            dfs(image, sr + 1, sc, color, orginalColor);
            dfs(image, sr, sc + 1, color, orginalColor);
            dfs(image, sr, sc - 1, color, orginalColor);
        } else {
            return;
        }
    }

}
