/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

/**
 *
 * @author irulg
 */
import java.util.LinkedList;
import java.util.Scanner;

public class NewGraph<T> {
    int vertex;
    int type;
    String[] saveInd;

    LinkedList<T> list[];

    public NewGraph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        saveInd = new String[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public boolean graphType() {
        boolean gtype;
        gtype = (this.type == 1) ? true : false;

        return gtype;
    }

    public int ind(T value) {
        int ind = 0;
        for (int i = 0; i < list.length; i++) {
            if (saveInd[i].equals(value)) break;
            ind++;
        }
        return ind;
    }

    public void addEdge(int source, T destination) {

        if (graphType()) {
            list[source].addFirst(destination);
        } else {
            list[source].addFirst(destination);
            int ind = ind(destination);
            list[ind].addFirst((T) saveInd[source]);
        }
    }

    public void degree(T source) throws Exception {
        int ind = 0;
        for (int i = 0; i < list.length; i++) {
            if (saveInd[i].equals(source)) break;
            ind++;
        }
        if (!graphType()) {
        //degree undeirected graph
        System.out.println("degree vertex " + source + " : " + list[ind].size());
        } else {
        //degree directed graph
        //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) ++totalIn;
            }

            //outDegree
            for (k = 0; k < list[ind].size(); k++) {
                list[ind].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        }
    }

    public void removeEdge(int source, T destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (destination == list[source].get(i)) {
                list[source].remove(i);
            }
        }
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("vertex " + saveInd[i] + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    static void mainMenu() {
        System.out.println("Main menu\n" +
                "1.Add Edge\n" +
                "2.Check Degree\n" +
                "3.Print Graph\n" +
                "4.Remove Edge\n" +
                "5.Selesai\n" +
                "6.Ulangi ");
    }

    public static void main(String[] args) throws Exception{
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input banyaknya vertex: ");
        int vertex = userInput.nextInt();

        NewGraph graph = new NewGraph(vertex);

        int input;
        do {
            boolean isString = false;

            System.out.println("Pilih type graph: " +
                    "\n1. Integer" +
                    "\n2. String");
            int type = userInput.nextInt();
            userInput.nextLine();
            if (type == 2) {
                for (int i = 0; i < vertex; i++) {
                    System.out.print("Input vertex ke-" + i + " : ");
                    graph.saveInd[i] = userInput.nextLine();
                    isString = true;
                }
            } else if (type == 1) {
                for (int i = 0; i < vertex; i++) {
                    graph.saveInd[i] = Integer.toString(i);
                }
            }

            int pg;
            do {
                System.out.println("Pilih jenis graph" +
                        "\n1. Directed Graph" +
                        "\n2. Undirected Graph");
                pg = userInput.nextInt();
                userInput.nextLine();
                if (pg == 1 || pg == 2) graph.type = pg;

            } while (pg > 2 || pg < 1);

            do {
                mainMenu();
                input = userInput.nextInt();
                userInput.nextLine();
                switch (input) {
                    case 1:
                        try {
                            if (isString) {
                                System.out.print("Input source: ");
                                String sources = userInput.nextLine();
                                System.out.print("Input destination: ");
                                String destinations = userInput.nextLine();
                                int ind = graph.ind(sources);
                                graph.addEdge(ind, destinations);
                            } else {
                                System.out.print("Input source: ");
                                int source = userInput.nextInt();
                                System.out.print("Input destination: ");
                                int destination = userInput.nextInt();
                                graph.addEdge(source, destination);
                            }
                        } catch (IndexOutOfBoundsException E) {
                            System.out.println("Error : " + E.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            if (isString) {
                                System.out.print("Input source(degree): ");
                                String sourceDegrees = userInput.nextLine();
                                graph.degree(sourceDegrees);
                            } else {
                                System.out.print("Input source(degree): ");
                                int sourceDegree = userInput.nextInt();
                                graph.degree(sourceDegree);
                            }
                        } catch (IndexOutOfBoundsException E) {
                            System.out.println("Error: " + E.getMessage());
                        }
                        break;
                    case 3:
                        graph.printGraph();
                        break;
                    case 4:
                        try {
                            System.out.print("Input source: ");
                            int sourceDelete = userInput.nextInt();
                            System.out.print("Input destination: ");
                            int destinationDelete = userInput.nextInt();
                            graph.removeEdge(sourceDelete, destinationDelete);
                        } catch (IndexOutOfBoundsException E) {
                            System.out.println("Error: " + E.getMessage());
                        }
                        break;
                }
            } while (input > 0 && input < 5);
        } while (input == 6);
//        Graph graph = new Graph(6);
//        graph.addEdge(0,1);
//        graph.addEdge(0,4);
//        graph.addEdge(1,2);
//        graph.addEdge(1,3);
//        graph.addEdge(1,4);
//        graph.addEdge(2,3);
//        graph.addEdge(3,4);
//        graph.addEdge(3,0);
//        graph.printGraph();
//        graph.degree(2);
//
//        graph.removeEdge(1, 2);
//        graph.printGraph();
    }
}

