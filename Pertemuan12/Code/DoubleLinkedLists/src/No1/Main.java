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
public class Main {
    public static void main(String[] args) throws Exception {
        
        DoubleLinkedLists lists = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int co, dt, pointer;
        do{
            menu();
            co = sc.nextInt();
            
            switch(co){
                case 1:
                    System.out.print("Masukkan data : ");
                    dt = sc.nextInt();
                    lists.addFirst(dt);
                    break;
                case 2:
                    System.out.print("Masukkan data : ");
                    dt = sc.nextInt();
                    lists.addLast(dt);
                    break;
                case 3:
                    System.out.print("Masukkan data : ");
                    dt = sc.nextInt();
                    System.out.print("Masukkan pointer ke- : ");
                    pointer = sc.nextInt();
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
                    System.out.println("Cetak Data");
                    lists.print();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan data : ");
                    dt = sc.nextInt();
                    lists.findData(dt);
                    break;
                case 9:
                    System.out.println("---------------");
                    System.out.println("SORTING ASC");
                    lists.sortList(true);
                    lists.printSort();
                    System.out.println("---------------");
                    System.out.println("SORTING DESC");
                    lists.sortList(false);
                    lists.printSort();
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
        System.out.println("-------------------");
        System.out.println("PENGELOLA ANGKA DLL");
        System.out.println("-------------------");
        System.out.println("1. Tambah head");
        System.out.println("2. Tambah tail");
        System.out.println("3. Tambah data");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
        System.out.print("o> ");
    }
}