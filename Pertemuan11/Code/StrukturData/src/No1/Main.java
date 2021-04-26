/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author irulg
 */
public class Main {
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
        singLL.insertBefore(890,111);
        singLL.print();
        singLL.insertAt(3,833);
        singLL.print();
    }
}