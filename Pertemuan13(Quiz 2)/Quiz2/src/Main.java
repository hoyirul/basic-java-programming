/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irulg
 */
//Nama  : Mochammad Hairullah
//NIM   : 2041720074
//ABSEN : 19
import java.util.Scanner;
public class Main {
    static DoubleLinkedLists lists = new DoubleLinkedLists();
    static Scanner sc = new Scanner(System.in);
    static int co, pointer, nim, key;
    static String nama, jurusan, prodi;
    static double ipk;
    
    public static void main(String[] args) throws Exception {
        data();
        do{
            menu();
            co = sc.nextInt();
            switch(co){
                case 1:
                    add(co);
                    break;
                case 2:
                    add(co);
                    break;
                case 3:
                    add(co);
                    break;
                case 4:
                    System.out.print("Masukkan pointer ke- : ");
                    pointer = sc.nextInt();
                    lists.remove(pointer);
                    break;
                case 5:
                    lists.removeFirst();
                    break;
                case 6:
                    lists.removeLast();
                    break;
                case 7:
                    System.out.println("CETAK DATA SEMUA");
                    lists.print();
                    break;
                case 8:
                    lists.printFirst();
                    break;
                case 9:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan data nim : ");
                    key = sc.nextInt();
                    lists.findData(key);
                    break;
                case 10:
                    System.out.println("----------------------------");
                    System.out.println("SORTING IPK-DESC");
                    lists.sortList();
                    lists.print();
                    break;
                case 11:
                    System.out.println("ANDA SUDAH KELUAR APLIKASI");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }while(co < 11 || co > 0);
    }
    
    static void add(int co) throws Exception{
        System.out.println("Masukkan data awal");
        System.out.print("Masukkan NIM : ");
        nim = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan NAMA : ");
        nama = sc.nextLine();
        System.out.print("Masukkan JURUSAN : ");
        jurusan = sc.nextLine();
        System.out.print("Masukkan PRODI : ");
        prodi = sc.nextLine();
        System.out.print("Masukkan IPK  : ");
        ipk = sc.nextDouble();
        
        Mahasiswa dt = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
        switch(co){
            case 1:
                System.out.print("Masukkan pointer ke- : ");
                pointer = sc.nextInt();
                lists.add(dt, pointer);
                break;
            case 2:
                lists.addLast(dt);
                break;
            case 3:
                lists.addFirst(dt);
                break;
        }
    }
    
    static void menu(){
        System.out.println("-------------------------");
        System.out.println("PENGOLAHAN DATA MAHASISWA");
        System.out.println("-------------------------");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tambah Data Mahasiswa Posisi Akhir");
        System.out.println("3. Tambah Data Mahasiswa Posisi Awal");
        System.out.println("4. Hapus Data Mahasiswa");
        System.out.println("5. Hapus Data Mahasiswa Posisi Awal");
        System.out.println("6. Hapus Data Mahasiswa Posisi Akhir");
        System.out.println("7. Cetak Data Mahasiswa");
        System.out.println("8. Temukan Data Urutan Pertama");
        System.out.println("9. Cari Data Mahasiswa (NIM)");
        System.out.println("10. Urut Data Mahasiswa (IPK)");
        System.out.println("11. Keluar");
        System.out.print("o> ");
    }
    
    static void data() throws Exception{
        Mahasiswa dt1 = new Mahasiswa(101020, "Hairullah", "Teknik", "Informatika ", 4.0);
        Mahasiswa dt2 = new Mahasiswa(101021, "AIda Mill", "Bisnis", "Akuntansi   ", 3.7);
        Mahasiswa dt3 = new Mahasiswa(101022, "Dherisma ", "Bisnis", "Administrasi", 3.4);
        
        lists.addFirst(dt1);
        lists.addLast(dt3);
        lists.add(dt2, 1);
    }
}
