package data_structure;

/*
Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

SOLUTION:
Go through the matrix, using a double for i,j, when you find an island, increment the number of islands, r
eplace the island with 0,  so you dont see it anymore.
and validate not edge or water and recursively go through the N, S, E, W from that island.
Return num of Islands variable

*/
public class NumOfIslands {
    boolean isNotEdge(int[][] island, int i, int j) {
        return (i >= 0 && j >= 0 && i < island.length && j < island[i].length);
    }

    void isIsland(int[][] island, int i, int j) {
        if (!isNotEdge(island,i , j) || island[i][j] == 0) {
            return;
        }
        island[i][j]=0;
        isIsland(island,i-1, j);//north
        isIsland(island,i+1, j);//south
        isIsland(island,i, j+1);//east
        isIsland(island,i, j-1);//west
    }


    int isIslands(int[][] ocean) {
        System.out.println("Son islas solitarias ");
        int TOTALES = 0;

        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean[i].length; j++) {
                System.out.print(" || " + ocean[i][j]);
                if(ocean[i][j] == 1) {
                    TOTALES++;
                    isIsland(ocean, i, j);
                }
            }
            System.out.println();
        }
        System.out.println("ISLAS TOTALES: " + TOTALES);
        return TOTALES;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1, 1},
                        {1, 1, 0, 1, 0},
                        {1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0}};
        int[][] grid2 = {{1, 1, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 1, 1}};

        int[][] grid3 = {{0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}};
        NumOfIslands ni = new NumOfIslands();

        System.out.println("OCEAN ");
        ni.isIslands(grid);
        ni.isIslands(grid2);
        ni.isIslands(grid3);
        System.out.println();
    }
}
