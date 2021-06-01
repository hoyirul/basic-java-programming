/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number1_4;

/**
 *
 * @author irulg
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        System.out.println("ADD ITERATIF");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Min value   : " + bt.findMinValue());
        System.out.println("Max value   : " + bt.findMaxValue());
        System.out.print("Print Leaf  : ");
        bt.printLeaf(bt.root);
        System.out.println("\nCount Leaf  : " + bt.countLeaf(bt.root));
        System.out.println("");
        System.out.println("");
        
        bt.addRec(6);
        bt.addRec(4);
        bt.addRec(8);
        bt.addRec(3);
        bt.addRec(5);
        bt.addRec(7);
        bt.addRec(9);
        bt.addRec(10);
        bt.addRec(15);
        
        System.out.println("ADD REKURSIF");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Min value   : " + bt.findMinValue());
        System.out.println("Max value   : " + bt.findMaxValue());
        System.out.print("Print Leaf  : ");
        bt.printLeaf(bt.root);
        System.out.println("\nCount Leaf  : " + bt.countLeaf(bt.root));
        System.out.println("");
        System.out.println("");
    }
}