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
public class Queue {
    Node head;
    int size;
    
    public Queue(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null; 
    }
    
    public int size(){
        return size;
    }
    
    public void addFirst(Orang item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode; 
            head = newNode;
        }
        size++;
    }
    
    public void Enqueue(Orang item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head; // current merupaka node yg kita fokuskan saat itu (berarti fokusnya pada head)
            while (current.next != null){ 
                current = current.next; 
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void Dequeue() throws Exception {
        System.out.println("-------------------------------------");
        System.out.println(head.data.nama + " Telah selesai divaksinasi");
        System.out.println("-------------------------------------");
        
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
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
    
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("DAFTAR PENGANTRI VAKSIN");
            System.out.println("-----------------------------------");
            System.out.println("NO  |  NAMA");
            System.out.println("-----------------------------------");
            while (tmp != null){
                System.out.println(tmp.data.no + "   |  " + tmp.data.nama);
                tmp = tmp.next;
            }
            System.out.println("-----------------------------------");
            System.out.println("SISA ANTREAN : " + (size()));
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
