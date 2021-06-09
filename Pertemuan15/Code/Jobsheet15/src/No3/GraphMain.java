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
import java.util.Scanner;
public class GraphMain {
    public static void main(String[] args)  throws Exception {
        Scanner input = new Scanner(System.in);
         int count = 1, to, from, pilih;
         boolean jenis;
  
         System.out.println("Menu Graph");
         System.out.println("1. Directed");
         System.out.println("2. Undirected");
         System.out.print("o> : ");
         pilih = input.nextInt();
         if (pilih == 1) {
             System.out.print("Menggunakan Directed");
             jenis = true;
         } else {
             System.out.print("Menggunakan Undirected");
             jenis = false;
         }
         System.out.println("");
         Graph graph = new Graph(6, jenis);
         System.out.print("Masukkan jumlah  lintasan : ");
         int jumlah = input.nextInt();
         System.out.println("Masukkan edges: ");
         while (count <= jumlah) {
             to = input.nextInt();
             from = input.nextInt();
             graph.addEdge(to, from);
             count++;
         }
         System.out.println("");
         graph.printGraph(); 
         graph.degree(2); 
         graph.removeEdge(3, 4); 
         graph.printGraph();
    }
}
