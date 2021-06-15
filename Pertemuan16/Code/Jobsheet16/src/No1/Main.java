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
import java.util.Scanner;
import java.util.Stack;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Stack<Buku> books = new Stack();
    static String isbn, judul, terbit, penerbit;
    public static void main(String[] args) {
        menu();
    }
    
    static void menu(){
        System.out.println("Data Buku Perpustakaan");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        int option;
        do{
            System.out.print("o> ");
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    // push
                    add();
                    break;
                case 2:
                    // pop
                    ambil();
                    break;
                case 3:
                    // peek
                    cekTeratas();
                    break;
                case 4:
                    // print
                    printAll();
                    break;
                case 5:
                    // quit
                    System.exit(0);
                    break;
                default:
                    
            }
        }while(option > 0 || option < 6);
    }
    
    static void add(){
        System.out.print("isbn     : ");
        isbn = sc.nextLine();
        System.out.print("Judul    : ");
        judul = sc.nextLine();
        System.out.print("Terbit   : ");
        terbit = sc.nextLine();
        System.out.print("Penerbit : ");
        penerbit = sc.nextLine();
        Buku bk = new Buku(isbn, judul, terbit, penerbit);
        books.push(bk);
        System.out.println("BERHASIL MENAMBAHKAN");
        menu();
    }
    
    static void printAll(){
        System.out.println("Info Semua Data");
        int no = 1;
        for (Buku book : books) {
            System.out.printf("%d .  %s  %s  %s  %s \n", no++, book.isbn, book.judul, 
                    book.terbit, book.penerbit);
        }
        menu();
    }
    
    static void ambil(){
        System.out.println("Hapus Data Teratas");
        System.out.printf("%s  %s  %s  %s\n", books.peek().isbn, books.peek().judul, 
                    books.peek().terbit, books.peek().penerbit);
        books.pop();
        menu();
    }
    
    static void cekTeratas(){
        System.out.println("Cek Data Teratas");
        System.out.printf("%s  %s  %s  %s\n", books.peek().isbn, books.peek().judul, 
                    books.peek().terbit, books.peek().penerbit);
        menu();
    }
}
