/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number2;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        int jumlahMhs = 5;
        
        System.out.println("--------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari nim terkecil");
        for(int i=0;i<jumlahMhs;i++){
            System.out.println("---------------------");
            System.out.print("NIM   : ");
            int nim = s.nextInt();
            System.out.print("NAMA  : ");
            String nama = s1.nextLine();
            System.out.print("UMUR  : ");
            int umur = s.nextInt();
            System.out.print("IPK   : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("-------------------------");
        System.out.println("Data keseluruhan mahasiswa");
        data.tampil();
        
        
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Pencarian data");
        System.out.print("Masukkan nama mahasiswa yang di cari : ");
        String cari = s1.nextLine();        
        System.out.println("menggunakan sequensial search");
        int posisi = data.FindSeqSearchName(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
