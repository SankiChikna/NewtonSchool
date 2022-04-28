package Tree;

import java.util.*;

public class Graph {

    int V;
    int E;
    LinkedList<Integer>[] adj;

    Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
        E++;
    }

    void print() {
        for (int i = 0; i < V; i++) {
            System.out.println(adj[i]);
        }
    }

    void checkConnected(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        boolean visited[] = new boolean[V];
        int count = 0;
        while (queue.isEmpty() == false) {
            int popped = queue.poll();
            if (visited[popped] == false) {
                // count++;
                visited[popped] = true;
            }

            Iterator<Integer> itr = adj[popped].iterator();
            while (itr.hasNext()) {
                int element = itr.next();
                if (visited[element] == false) {
                    visited[element] = true;
                    queue.add(element);
                }
            }
        }
        System.out.println(Arrays.toString(visited));
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.checkConnected(0);
        // g.print();
    }
}
