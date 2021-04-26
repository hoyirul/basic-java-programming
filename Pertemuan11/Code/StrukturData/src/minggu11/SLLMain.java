/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author irulg
 */
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList(); 
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700,999);
        singLL.print();
        singLL.insertAt(3,833);
        singLL.print();
        
        // TAMBAHAN PRAKTIKUM 2
        System.out.println("data pada indeks ke- 1" +singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" +singLL.indexOf(760));
        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
