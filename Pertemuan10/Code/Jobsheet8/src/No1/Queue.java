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
public class Queue {
    public int max, size, front, rear;
    public int[] Q;
    
    public Queue(int max){
        this.max = max;
        Create();
    }
    
    public void Create(){
        Q = new int [max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){ // MENGECEK APAKAH QUEUE KOSONG ATAU TIDAK
        if(size == 0){ // queue ketika kosong
            return true;
        } else { // queue ketika ada isinya
            return false;
        }
    }
    
    public boolean IsFull(){ // MENGECEK APAKAH QUEUE SUDAH PENUH ATAU BELUM
        if (size == max) { // apakah size sudah mencapai nilai maksimal atau belum
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen Queue Terdepan : " + Q[front]);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void peekPosition(int data){
        if(!IsEmpty()){
            int i = 0, idx = -1, count = 0;
            while(i != rear){
                if(data == Q[i]){
                    idx = i;
                    count++;
                    break;
                }
                i = (i + 1) % max;
            }
            
            if(count > 0){
                System.out.println("Data         : " + data);
                System.out.println("Posisi Index : " + idx);
            }else{
                System.out.println("Data tidak ada");
            }
        }else{
            System.out.println("Data masih kosong");
        }
    }
    
    public void peekAt(int position){
        if(!IsEmpty()){
            if(position >= max || position < 0){
                System.out.println("Index melebihi atau kurang dari size!!!");
            }else{
                System.out.println("Index : " + position);
                System.out.println("Data  : " + Q[position]);
            }
        }else{
            System.out.println("Data masih kosong");
        }
        
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah Elemen : " + size);
        }
    }
    
    public void clear(){ // UNTUK MENGKOSONGKAN SELURUH ELEMEN YANG ADA DI QUEUE
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(int data){
        if (IsFull()) {
            System.out.println("Queue Sudah Penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0; //data yang diisi adalah data pertama
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data; // proses insert data
            size++;
        }
    }
    
    public int Dequeue(){
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max-1) {
                    front = 0;
                }
            }
        }
        return data;
    }
}
