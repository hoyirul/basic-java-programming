/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Services {
    Scanner sc = new Scanner(System.in);
    Node head;
    NodeKendaraan headKendaraan;
    int size, sizeKendaraan;

    public Services(){
        head = null;
        headKendaraan = null;
        size = 0;
        sizeKendaraan = 0;
    }
    
    // KENDARAAN
    public boolean isEmptyKendaraan(){
        return headKendaraan == null; 
    }
    
    public void addFirstKendaraan(Kendaraan item){
        if (isEmpty()) {
            headKendaraan = new NodeKendaraan(null, item, null);
        } else {
            NodeKendaraan newNode = new NodeKendaraan(null, item, headKendaraan);
            headKendaraan.prev = newNode; 
            headKendaraan = newNode;
        }
        sizeKendaraan++;
    }

    public void addLastKendaraan(Kendaraan item){
        if (isEmptyKendaraan()) {
            addFirstKendaraan(item);
        } else {
            NodeKendaraan current = headKendaraan; 
            while (current.next != null){ 
                current = current.next; 
            }
            NodeKendaraan newNode = new NodeKendaraan(current, item, null);
            current.next = newNode;
            sizeKendaraan++;
        }
    }
    
    public void printKendaraan(){
        if (!isEmptyKendaraan()) {
            NodeKendaraan tmp = headKendaraan;
            int no = 1;
            line(60);
            System.out.println("NO  TNKB \tNAMA \t\tJENIS \tCC \tTAHUN \tBULAN KE");
            line(60);
            while (tmp != null){
                System.out.println((no++) + ".  " + tmp.data.tnkb + "\t" + tmp.data.nama
                + " \t" + tmp.data.jenis + " \t" + tmp.data.cc +
                " \t" + tmp.data.tahun + " \t" + tmp.data.bulanTax);
                tmp = tmp.next;
            }
            line(60);
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public int sizeKendaraan(){
        return sizeKendaraan;
    }
    
    public void removeFirstKendaraan() throws Exception{
        if (isEmptyKendaraan()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (sizeKendaraan == 1){
            removeLastKendaraan();
        } else {
            headKendaraan = headKendaraan.next;
            headKendaraan.prev = null;
            sizeKendaraan--;
        }
    }
    
    public void removeLastKendaraan() throws Exception {
        if (isEmptyKendaraan()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (headKendaraan.next == null){
            headKendaraan = null;
            sizeKendaraan--;
            return;
        }
        NodeKendaraan current = headKendaraan;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        sizeKendaraan--;
    }
    // END KENDARAAN
    
    // PAJAK
    public boolean isEmpty(){
        return head == null; 
    }

    public void addFirst(Pajak item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode; 
            head = newNode;
        }
        size++;
    }

    public void addLast(Pajak item){
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
    
    public int size(){
        return size;
    }
    
    // END PAJAK
    
    public void clear(){
        head = null;
        headKendaraan = null;
        size = 0;
    }
    
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            NodeKendaraan tmp2 = headKendaraan;
            line(80);
            System.out.println("KODE  \tTNKB \t\tNOMINAL \tDENDA \t\tBULAN KE");
            line(80);
            double total = 0, denda = 0;
//            while (tmp != null){
//                while (tmp2 != null){
//                    if(tmp2.data.tnkb.equalsIgnoreCase(tmp.data.tnkb)){
//                        System.out.println(tmp.data.kode + "\t" + tmp.data.tnkb
//                        + " \t" + tmp2.data.nama + " \t" + tmp.data.nominal + " \t"
//                        + tmp.data.denda + " \t" + tmp2.data.bulanTax);
//                        total += tmp.data.nominal;
//                    }
//                }
//                tmp2 = tmp2.next;
//                tmp = tmp.next;
//            }
            while (tmp != null){    
                System.out.println(tmp.data.kode + "\t" + tmp.data.tnkb
                + " \t" + tmp.data.nominal + " \t"
                + tmp.data.denda + " \t" + tmp2.data.bulanTax);
                total += tmp.data.nominal;
                denda += tmp.data.denda;
                tmp = tmp.next;
            }
            line(80);
            System.out.println("NOMINAL TOTAL    : " + total);
            System.out.println("DENDA   TOTAL    : " + denda);
            line(30);
            System.out.println("TOTAL PENDAPATAN : " + (total + denda));
            line(30);
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    // PROSES TRANSAKSI
    public void transaksi(String key, String kode){
        if (!isEmptyKendaraan()) {
            NodeKendaraan tmp = headKendaraan;
            double pajak = 0, denda = 0, bayar = 0;
            int mth = -1;
            while (tmp != null){
                if(key.equalsIgnoreCase(tmp.data.tnkb)){
                    System.out.println("----------------------------------------");
                    System.out.println("KEY   : " + key);
                    System.out.println("NAMA  : " + tmp.data.nama + " - " + tmp.data.tahun);
                    System.out.println("JENIS : " + tmp.data.jenis);
                    System.out.println("CC    : " + tmp.data.cc + " CC");
                    System.out.println("TAGIHAN  : BULAN KE - " + tmp.data.bulanTax);
                    if(tmp.data.jenis.equals("Roda 2")){
                        if(tmp.data.cc < 100){
                            pajak = 100000;
                        }else if(tmp.data.cc >= 100 && tmp.data.cc < 250){
                            pajak = 250000;
                        }else{
                            pajak = 500000;
                        }
                    }else{
                        if(tmp.data.cc < 1000){
                            pajak = 750000;
                        }else if(tmp.data.cc >= 1000 && tmp.data.cc < 2500){
                            pajak = 1000000;
                        }else{
                            pajak = 1500000;
                        }
                    }
                    System.out.println("PAJAK    : Rp. " + pajak);
                    System.out.print("BAYAR PAJAK : BULAN KE - ");
                    mth = sc.nextInt();
                    if(mth < tmp.data.bulanTax){
                        System.out.println("Masih bukan waktunya bayar pajak!!");
                        transaksi(key, kode);
                    }else{
                        mth = mth - tmp.data.bulanTax;
                        if(mth == 0){
                            denda = 0;
                        }else if(mth <= 3){
                            System.out.println("TELAT BAYAR : " + mth + " Bulan");
                            denda = 50000;
                        }else{
                            System.out.println("TELAT BAYAR : " + mth + " Bulan");
                            denda = mth * 50000;
                        }
                    }
                    System.out.println("DENDA PAJAK : Rp. " + (denda));
                    System.out.println("TOTAL BAYAR : Rp. " + (pajak + denda));
                    System.out.println("----------------------------------------");
                    System.out.print("BAYAR PAJAK : Rp. ");
                    bayar = sc.nextDouble();
                    if(bayar < (pajak + denda)){
                        System.out.println("UANG ANDA KURANG !!");
                        transaksi(key, kode);
                    }else{
                        double x = bayar - (pajak + denda);
                        System.out.println("KEMBALIAN : Rp. " + x);
                    }
                    System.out.println("PEMBAYARAN PAJAK SUKSES");
                    System.out.println("----------------------------------------");
                }
                tmp = tmp.next;
            }
            Pajak pjk = new Pajak(kode, key, (pajak + denda), denda, mth);
            addLast(pjk);
            //System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    // FIND DATA
//    public void findData(String key){
//        if (!isEmpty()) {
//            Node tmp = head;
//            NodeKendaraan tmp2 = headKendaraan;
//            while (tmp != null){
//                
//                if(key.equalsIgnoreCase(tmp.data.kode)){
//                    while (tmp2 != null){
//                            System.out.println("MENCARI DATA");
//                            line(30);
//                            System.out.println("KEY     : " + key);
//                            System.out.println("TNKB    : " + tmp2.data.tnkb);
//                            System.out.println("NAMA    : " + tmp2.data.nama + " - " + tmp2.data.tahun);
//                            System.out.println("JENIS   : " + tmp2.data.jenis);
//                            System.out.println("CC      : " + tmp2.data.cc + " CC");
//                            System.out.println("NOMINAL : Rp. " + tmp.data.nominal);
//                            System.out.println("DENDA   : Rp. " + tmp.data.denda);
//                            System.out.println("TAGIHAN : BULAN KE - " + tmp2.data.bulanTax);
//                            line(30);
//                    }
//                    tmp2 = tmp2.next;
//                }
//                tmp = tmp.next;
//            }
//        } else {
//            System.out.println("Linked Lists Kosong");
//        }
//    }
    
    void line(int n){
        for(int i=0;i<n;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
}