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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Queue lists = new Queue();
        Scanner sc = new Scanner(System.in);
        int co, no;
        String nama;
        do{
            menu();
            co = sc.nextInt();
            sc.nextLine();
            
            switch(co){
                case 1:
                    System.out.println("MASUKKAN DATA PENERIMA VAKSIN");
                    System.out.println("-----------------------------");
                    System.out.println("NO ANTRIAN ANDA : " + (lists.size() + 1));
                    no = lists.size();
                    System.out.print("NAMA PENGANTRI  : ");
                    nama = sc.nextLine();
                    Orang org = new Orang((no + 1), nama);
                    lists.Enqueue(org);
                    break;
                case 2:
                    lists.Dequeue();
                    break;
                case 3:
                    lists.print();
                    break;
                case 4:
                    System.out.println("ANDA TELAH KELUAR APP");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }while(co < 5 || co > 0);
    }
    
    static void menu(){
        System.out.println("---------------------------------------");
        System.out.println("       PENGANTRI VAKSIN SINOVAC        ");
        System.out.println("---------------------------------------");
        System.out.println("1. Tambahkan Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.print("o> ");
    }
}