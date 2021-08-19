package data_structure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    private int V;

    private LinkedList<Integer> adj[];

    GraphBFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int x, int y) {
        adj[x].add(y);
    }
    void printGraph(LinkedList<Integer> adj[]) {
        for (int i = 0; i < V; i++) {
            System.out.println(" NODE " + i);
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(" " + adj[i].get(j));
            }
            System.out.println("  ");
        }
    }
    void buildGraph(GraphBFS g) {
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        //g.addEdge(3, 3);
        //g.addEdge(3, 0);
        //g.addEdge(4, 2);
    }


    void BFSFor(int s) {
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s]= true;
        queue.add(s);
        while(queue.size() != 0) {
            s = queue.poll();
            System.out.print(" " + s);

            for(int j=0;j<adj[s].size(); j++){
                if(!visited[adj[s].get(j)]) {
                    visited[adj[s].get(j)] = true;
                    queue.add(adj[s].get(j));
                }
            }
        }
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s]= true;
        queue.add(s);

        while(queue.size() != 0) {
            s = queue.poll();
            System.out.print(" " + s);

          Iterator<Integer> ite = adj[s].listIterator();
            while(ite.hasNext()) {
                int n = ite.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        GraphBFS g = new GraphBFS(7);
        int Start = 0;

        g.buildGraph(g);

        System.out.println("Imprimir INORDER ");
        g.printGraph(g.adj);
        System.out.println(
                "Following is Breadth First Traversal ");
        g.BFS(Start);
        System.out.println();
                System.out.println("Doble FOR");
        g.BFSFor(Start);

    }
}
