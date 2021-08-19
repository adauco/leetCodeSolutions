package data_structure;

import java.util.Iterator;
import java.util.LinkedList;
/*
Traverse through a graph using DFS (depth first search)

 */
public class GraphDFS {
    private int V;

    private LinkedList<Integer> adj[];

    GraphDFS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i ++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int x, int y) {
        adj[x].add(y);
    }
    void buildGraph(GraphDFS g) {
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(3, 0);
        g.addEdge(4, 2);

    }

    void printGraph(LinkedList<Integer> adj[]) {
        for(int i = 0; i < V; i ++) {
            System.out.println(" NODE " + i);
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(" " + adj[i].get(j));
            }
            System.out.println("  ");
        }
    }

    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.println();
        System.out.print("Visited " + v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        for(int dato : adj[v]) {
            if(!visited[dato])
                DFSUtil(dato,visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v) {
        System.out.println("start with a specific node");
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
    // The function to do DFS traversal. It uses recursive
    void DFS()
    {
        System.out.println("Traverse inconected graphs");
        boolean visited[] = new boolean[V];
        // Call the recursive helper function to print DFS
        // traversal starting from all vertices one by one
        for (int i = 0; i < V; ++i) {
            if (visited[i] == false)
                DFSUtil(i, visited);
        }
    }

    public static void main(String args[]) {
        GraphDFS g  = new GraphDFS(5);
        g.buildGraph(g);
        System.out.println(
                "Following is Depth First Traversal ");
       // g.printGraph(g.adj);
        g.DFS(4);
        System.out.println();
        g.DFS();
    }
}
