/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak1;

/**
 *
 * @author irulg
 */
public class LinkedList {
    //deklarasi atribut
    Node head;
    int size;
    
    public LinkedList(){//konstruktor
        head = null;
        size = 0;
    }
    
    //mengecek kondisi linked list kosong
    public boolean isEmpty(){
        return head == null;
    }
    
    //menambah data pada bagian depan linked list
    public void addFirst(int item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    //menambah data pada bagian belakang linked list
    public void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    //menambah data di posisi indeks tertentu
    public void add(int item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai Indeks di Luar Batas");
        } else {
            Node current = head;
            int i = 1;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.prev = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    //mendapatkan nilai dari size (jumlah size akan diperbarui secara otomatis)
    public int size(){
        return size;
    }
    
    //menghapus semua isi linked list sehingga linked list dalam kondisi kosong
    public void clear(){
        head = null;
        size = 0;
    }
    
    //mencetak seluruh isi linked list
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    //Praktikum 2
    //menghapus data pada bagian paling depan
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if(size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    //menghapus data pada bagian paling belakang
    public void removeLast() throws Exception{
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
    
    //menghapus data pada indeks tertetntu
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    //Praktikum 3
    //mendapatkan data pada awal linked list
    public int getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }
    
    //mendapatkan data pada akhir linked lists
    public int getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    //mendapatkan data pada indeks tertentu
    public int get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Indeks di Luar Batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}