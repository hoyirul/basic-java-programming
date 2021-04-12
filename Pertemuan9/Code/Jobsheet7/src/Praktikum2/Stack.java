/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author irulg
 */
public class Stack {
    int size, top;
    Buku data[];
    
    Stack(int size){
        this.size = size;
        data = new Buku[size];
        top = -1;
    }
    
    boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    boolean isFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }
    
    void push(Buku bk){
        if(!isFull()){
            top++;
            data[top] = bk;
        }else{
            System.out.println("Isi stack penuh!!");
        }
    }
    
     void pop(){
        if(!isEmpty()){
            Buku x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.judul + " " + 
                    x.namaPengarang + " " + x.tahunTerbit + " " + x.jmlHalaman
                    + " " + x.harga);
        }else{
            System.out.println("Isi stack masih kosong");
        }
    }
     
    void peek(){
        top++;
        System.out.println("Elemen teratas : " + data[top].judul + " " + 
                    data[top].namaPengarang + " " + data[top].tahunTerbit + " " + data[top].jmlHalaman
                    + " " + data[top].harga);
    }
    
    void print(){
        System.out.println("Isi stack : ");
        for(int i=top;i>=0;i--){
            System.out.println(data[i].judul + " " + data[i].namaPengarang 
                    + " " + data[i].tahunTerbit + " " + data[i].jmlHalaman
                    + " " + data[i].harga);
        }
        System.out.println("");
    }
    
    void clear(){
        if(!isEmpty()){
            for(int i=top;i>=0;i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal!, Stack masih kosong!");
        }
    }
}
