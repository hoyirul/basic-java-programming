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
public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null; 
    }
    
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
    
    public void addLast(int item){
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
    
    public void add(int item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size){ 
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
            } else {
                Node newNode = new Node(null, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
                
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null){
                System.out.print(tmp.data + "\n");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void findData(int key){
        if (!isEmpty()) {
            Node tmp = head;
            int dt = 0, i = -1;
            while (tmp != null){
                if(tmp.data == key){
                    dt = tmp.data;
                    i++;
                    tmp = tmp.next;
                }
                break;
            }
            System.out.println("Data " + dt + " Berada di node ke-" + i);
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void sortList(boolean bool){
        // Node current will point to head
        Node current = head, index = null;
        int temp;
        if (head == null) {
            //return;
        }else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if(bool == true){
                        if (current.data > index.data) {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                    }else{
                        if (current.data < index.data) {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                    }
                    
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void printSort(){
        // Node current will point to head
        Node current = head;
  
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    // PRAK 2
    public void removeFirst() throws Exception{
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
    
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
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
    
    // PRAK 3
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
            return head.data;
    }

    
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
        
}
