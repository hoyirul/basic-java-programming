/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
    public void addFirst(Mahasiswa item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode; 
            head = newNode;
        }
        size++;
    }
    
    public void addLast(Mahasiswa item){
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
    
    public void add(Mahasiswa item, int index) throws Exception{
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
            System.out.println("-------------------------------------------------------");
            System.out.println("NIM  \tNAMA \t        JURUSAN   PRODI\t\tIPK");
            System.out.println("-------------------------------------------------------");
            while (tmp != null){
                System.out.println(tmp.data.nim + "\t" + tmp.data.nama
                + " \t" + tmp.data.jurusan + " \t  "+ tmp.data.prodi 
                + " \t" + tmp.data.ipk);
                tmp = tmp.next;
            }
            System.out.println("----------------------------------------");
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void printFirst(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("-------------------------------------------------------");
            System.out.println("NIM  \tNAMA \t        JURUSAN   PRODI\t\tIPK");
            System.out.println("-------------------------------------------------------");
            System.out.println(tmp.data.nim + "\t" + tmp.data.nama
                + " \t" + tmp.data.jurusan + " \t  "+ tmp.data.prodi 
                + " \t" + tmp.data.ipk);
            System.out.println("----------------------------------------");
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void findData(int key){
        if (!isEmpty()) {
            Node tmp = head;
            int i = -1;
            while (tmp != null){
                if(key == tmp.data.nim){
                    System.out.println("MENCARI DATA");
                    System.out.println("----------------------------------------");
                    System.out.println("KEY     : " + key);
                    System.out.println("NIM     : " + tmp.data.nim);
                    System.out.println("NAMA    : " + tmp.data.nama);
                    System.out.println("JURUSAN : " + tmp.data.jurusan);
                    System.out.println("PRODI   : " + tmp.data.prodi);
                    System.out.println("IPK     : " + tmp.data.ipk);
                    i++;
                }
                tmp = tmp.next;
            }
            
            if(i > -1){
                System.out.println("STATUS  : DITEMUKAN");
                System.out.println("----------------------------------------");
            }else{
                System.out.println("----------------------------------------");
                System.out.println("KEY     : " + key);
                System.out.println("STATUS  : TIDAK DITEMUKAN");
                System.out.println("----------------------------------------");
            }
            
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void sortList(){
        // Node current will point to head
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        }else {
            for(current = head; current.next != null; current = current.next) {  
                for(index = current.next; index != null; index = index.next) {
                    if(index.data.ipk > current.data.ipk) {  
                        temp = (int) current.data.ipk;  
                        current.data.ipk = index.data.ipk;  
                        index.data.ipk = temp;
                    }  
                }  
            }  
        }
    }
    
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
}
