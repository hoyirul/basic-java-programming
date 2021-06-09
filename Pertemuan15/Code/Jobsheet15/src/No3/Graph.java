/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

/**
 *
 * @author irulg
 */
public class Graph {
    int vertex;
        boolean typegraph; 
        LinkedList list[];
     
        public Graph(int vertex, boolean typegraph) {
            this.vertex = vertex;
            this.typegraph = typegraph;
            list = new LinkedList[vertex];
            for (int i = 0; i < vertex; i++) {
                list[i] = new LinkedList();
            }
        }
        //method addEdge()
        public void addEdge(int source, int destination) {
            if (graphtype(typegraph)) {
                list[source].addFirst(destination);
            } else {
                list[source].addFirst(destination);
                list[destination].addFirst(source);
            }
     
        }
        public void degree(int source) throws Exception {
            if (graphtype(typegraph)) {
                int k, totalIn = 0, totalOut = 0;
                for (int i = 0; i < vertex; i++) {
                    for (int j = 0; j < list[i].size(); j++) { 
                        if (list[i].get(j) == source) {
                            ++totalIn;
                        }
                    }
                    for (k = 0; k < list[source].size(); k++) {
                        list[source].get(k);
                    }
                    totalOut = k;
                } 
                System.out.println("Indegree dari vertex " + source + " : " + totalIn); 
                System.out.println("Outdegree dari vertex " + source + " : " + totalOut); 
                System.out.println("degree vertex " + source + " : " + (totalIn + totalOut)); 
            } else {
                //degree undirected graph 
                System.out.println("degree vertex " + source + " : " + list[source].size()); 
            }
        }
        public void removeEdge(int source, int destination) throws Exception{
            for (int i = 0; i < list[source].size(); i++) {
                if (destination==list[source].get(i)){
                    list[source].remove(i);
                }
            }
        }
        public void removeAllEdges() {
            for (int i = 0; i < vertex; i++) {
                list[i].clear(); 
            } 
            System.out.println("Graph berhasil dikosongkan");
        }
        public void printGraph() throws Exception {
            for (int i = 0; i < vertex; i++) {
                if (list[i].size() > 0) {
                    System.out.print("Vertex " + i + " terhubung dengan: ");
                    for (int j = 0; j < list[i].size(); j++) {
                        System.out.print(list[i].get(j) + " ");
                    }
                    System.out.println(""); 
    
                }
            }
            System.out.println(" ");
        }
        boolean graphtype(boolean pilih) {
            return pilih;
        }
}
