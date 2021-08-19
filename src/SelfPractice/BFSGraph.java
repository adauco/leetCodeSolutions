package SelfPractice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    int Value = 0;
    LinkedList<Integer> graph[];

    BFSGraph( int v) {
        Value = v;
        graph = new LinkedList[v];
        for(int i =0; i < v; i++) {
            graph[i] = new LinkedList<>();
        }
    }

     void addEdge(int i, int j) {
         graph[i].add(j);
    }

    void printGraph(LinkedList<Integer> graph[]) {
        for(int i=0; i < graph.length; i++){
            for(int j =0; i < graph[i].size(); j++) {
                System.out.print(graph[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    void buildGraph(BFSGraph graph){
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(2,6);
        graph.addEdge(6,0);
    }
    void BFSNodeRecursive(int node, boolean[] visited) {
        visited[node] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        while (queue.size() > 0) {
            int s = queue.poll();
                System.out.print(s + " ");

            Iterator<Integer> ite = graph[s].listIterator();
            while (ite.hasNext()) {
                int n = ite.next();
                if (visited[n] == false) {
                    System.out.print(visited[n] == false?true:false);
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void BFSNode(int node){
        boolean visited[] = new boolean[Value];
        BFSNodeRecursive(node, visited);
    }

    void BFSAllNodes(){
        boolean visited[] = new boolean[Value];
        for(int i = 0; i < graph.length; i++){
            BFSNodeRecursive(i, visited);
        }
    }

    public static void main(String[] args) {
        BFSGraph gra = new BFSGraph(7);
        gra.buildGraph(gra);
        System.out.println("Single Node");
        gra.BFSNode(2);
        System.out.println();
        System.out.println("ALL NODES");
        gra.BFSAllNodes();

    }

}
