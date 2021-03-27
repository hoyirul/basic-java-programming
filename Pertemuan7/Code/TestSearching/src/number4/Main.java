/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number4;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Process data = new Process();
        Data m1 = new Data(12);
        Data m2 = new Data(17);
        Data m3 = new Data(2);
        Data m4 = new Data(1);
        Data m5 = new Data(70);
        Data m6 = new Data(50);
        Data m7 = new Data(90);
        Data m8 = new Data(17);
        Data m9 = new Data(2);
        Data m0 = new Data(90);
        
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);
        data.tambah(m5);
        data.tambah(m6);
        data.tambah(m7);
        data.tambah(m8);
        data.tambah(m9);
        data.tambah(m0);
        
        System.out.println("-------------------------");
        System.out.println("Data keseluruhan");
        data.tampil();
        System.out.println("-------------------------");
        System.out.println("Data yang telah diurutkan ASC");
        data.selectionSort();
        data.tampil();
        
        System.out.println("----------------------------");
        System.out.println("Pencarian data");
        System.out.print("Masukkan nilai yang di cari : ");
        int cari = sc.nextInt();        
        System.out.println("menggunakan binary search");
        int posisi = data.FindBinarySearch(cari, 0, 9);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        data.arrMax();
    }
}
