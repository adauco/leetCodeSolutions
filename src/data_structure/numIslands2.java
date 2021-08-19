package data_structure;

import java.util.HashMap;
import java.util.LinkedList;

public class numIslands2 {
    private LinkedList<numIslands2> adj[];
    int ISLA, X, Y;
    numIslands2 east, west, north, south;
    HashMap<String, Integer> mapa = new HashMap<>();

    public numIslands2(){
        ISLA = 0;
        X = 0;
        Y = 0;
        north = south = east = west = null;

        adj = new LinkedList[10];
        for(int i = 0; i < 10; i ++)
            adj[i] = new LinkedList<>();
    }
    public numIslands2(int isla, int x, int y) {
        ISLA = isla;
        X = x;
        Y = y;
        north = south = east = west = null;

        adj = new LinkedList[10];
        for(int i = 0; i < 10; i ++)
            adj[i] = new LinkedList<>();
    }

    boolean isEdge(int[][] island, int i, int j) {
        return (i >= 0 && j >= 0 && i < island.length && j < island[i].length);
    }

    int revisarVecino(int[][] island, int i, int j) {
        if (isEdge(island,i , j) && island[i][j] == 1) {
            if (mapa.get("" + i + j) == null) {
                addToMap(i, j, 0);
                addToMap(i, j, isIsland(island, i, j));
            } else {
                return mapa.get("" + i + j);
            }
        }
        return 0;
    }

    int isIsland(int[][] island, int i, int j) {
        int surrounded = 0;
        int islandsFound;


        if (island[i][j] == 1) {
            if(mapa.isEmpty()) {
                mapa.put("" + i + j, ISLA);
            }
            //Review north
            surrounded += revisarVecino(island,i-1, j);

            //Review south
            surrounded += revisarVecino(island,i+1, j);

            //Review east
            surrounded += revisarVecino(island,i, j+1);

            //Review west
            surrounded += revisarVecino(island,i, j-1);

            if (surrounded < 1) {
                ISLA++;
                addToMap(i,j,ISLA);
                return ISLA;
            }
        }
        return surrounded;
    }

    void addToMap(int i, int j, int ISLA) {
        mapa.put("" + i + j, ISLA);
    }

    int addToMap(int i, int j) {
        ISLA++;
        mapa.put("" + i + j, ISLA);
        System.out.println("MAPA ISLA VALUE: "+ mapa.get("" +i+j));
        return ISLA;
    }

    void isIslands(int[][] ocean) {
        System.out.println("Son islas solitarias? ");

        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean[i].length; j++) {
                System.out.print(" " + ocean[i][j] + " " + isIsland(ocean, i, j));
            }
            System.out.println();
        }
        System.out.println();
    }

    void printOcean(int[][] ocean) {
        System.out.println("OCEAN ");

        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean[i].length; j++) {
                System.out.print(" " + ocean[i][j]);
            }
            System.out.println();
        }
    }

    int getNumberIslands(int[][] ocean) {
        System.out.println("OCEAN ");

        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean.length; j++) {
                System.out.print(" " + ocean[i][j]);
            }
            System.out.println();
        }
        return 1;
    }

    void addEdge(int x, numIslands2 nodo) {
        numIslands2 NO = new numIslands2(1,1,1);
        adj[x].add(nodo);
        adj[x+1].add(NO);
        //adj[x].get(y).ISLA;
        adj[x].size();
        adj[x].get(0);
    }

    public static void main(String[] args) {
        int[][] grid2 = {{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}};
        int[][] grid = {{1, 1, 1, 1, 1}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] grid3 = {{0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}};
        numIslands2 ni = new numIslands2();

        //numIslands2 NO = new numIslands2(1,1,1);
        //ni.adj[0].add(NO);
        ni.ISLA = 1;
        System.out.println("OCEAN ");
        //ni.isIslands(grid);
        ni.isIslands(grid2);
        //ni.isIslands(grid3);
        System.out.println("OCEAN2 " + ni.ISLA);


    }
}
