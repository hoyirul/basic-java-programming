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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Stack lists = new Stack();
        Scanner sc = new Scanner(System.in);
        int co;
        String judul;
        do{
            menu();
            co = sc.nextInt();
            sc.nextLine();
            
            switch(co){
                case 1:
                    System.out.print("Masukkan Judul Buku : ");
                    judul = sc.nextLine();
                    Buku bk = new Buku(judul);
                    lists.push(bk);
                    break;
                case 2:
                    lists.pop();
                    break;
                case 3:
                    lists.peek();
                    break;
                case 4:
                    lists.print();
                    break;
                case 5:
                    System.out.println("ANDA TELAH KELUAR APP");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }while(co < 6 || co > 0);
    }
    
    static void menu(){
        System.out.println("----------------------");
        System.out.println("DATA BUKU PERPUSTAKAAN");
        System.out.println("----------------------");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.print("o> ");
    }
}