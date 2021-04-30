/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author irulg
 */
public class Stack {
    Node head;
    int size;
    
    public Stack(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null; 
    }
    
    public void push(Buku item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode; 
            head = newNode;
        }
        size++;
    }
    
    public void pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        
        System.out.println("-------------------------------------");
        System.out.println("BUKU TUMPUKAN TERATAS TELAH DI AMBIL");
        System.out.println("-------------------------------------");
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void peek(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("CEK BUKU TERATAS");
            System.out.println("-------------------------");
            System.out.println(tmp.data.judul);
            System.out.println("-------------------------");
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("CETAK SEMUA JUDUL BUKU");
            System.out.println("-------------------------");
            while (tmp != null){
                System.out.print(tmp.data.judul + "\n");
                tmp = tmp.next;
            }
            System.out.println("-------------------------");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
