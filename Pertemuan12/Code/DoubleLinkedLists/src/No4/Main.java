/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists lists = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int co, pointer, nim, key;
        String nama;
        double ipk;
        do{
            menu();
            co = sc.nextInt();
            
            switch(co){
                case 1:
                    System.out.println("Masukkan data awal");
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan NAMA : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan IPK  : ");
                    ipk = sc.nextDouble();
                    
                    Mahasiswa dtFirst = new Mahasiswa(nim, nama, ipk);
                    lists.addFirst(dtFirst);
                    break;
                case 2:
                    System.out.println("Masukkan data awal");
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan NAMA : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan IPK  : ");
                    ipk = sc.nextDouble();
                    
                    Mahasiswa dtLast = new Mahasiswa(nim, nama, ipk);
                    lists.addFirst(dtLast);
                    break;
                case 3:
                    System.out.println("Masukkan data awal");
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan NAMA : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan IPK  : ");
                    ipk = sc.nextDouble();
                    System.out.print("Masukkan pointer ke- : ");
                    pointer = sc.nextInt();
                    
                    Mahasiswa dt = new Mahasiswa(nim, nama, ipk);
                    lists.add(dt, pointer);
                    break;
                case 4:
                    lists.removeFirst();
                    break;
                case 5:
                    lists.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan pointer ke- : ");
                    pointer = sc.nextInt();
                    lists.remove(pointer);
                    break;
                case 7:
                    System.out.println("CETAK DATA SEMUA");
                    lists.print();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan data : ");
                    key = sc.nextInt();
                    lists.findData(key);
                    break;
                case 9:
                    System.out.println("----------------------------");
                    System.out.println("SORTING IPK-DESC");
                    lists.sortList();
                    lists.print();
                    break;
                case 10:
                    System.out.println("ANDA SUDAH KELUAR APLIKASI");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }while(co < 11 || co > 0);
    }
    
    static void menu(){
        System.out.println("-------------------------");
        System.out.println("PENGOLAHAN DATA MAHASISWA");
        System.out.println("-------------------------");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut Data IPK-DESC");
        System.out.println("10. Keluar");
        System.out.print("o> ");
    }
}
