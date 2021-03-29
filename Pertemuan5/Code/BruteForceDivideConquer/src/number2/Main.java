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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();
        
        NilaiAlgoritma[] arrMhs = new NilaiAlgoritma[n];
        
        for(int i=0;i<arrMhs.length;i++){
            arrMhs[i] = new NilaiAlgoritma();
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama Mahasiswa : ");
            sc.nextLine();
            arrMhs[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan nilai tugas : ");
            arrMhs[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan nilai kuis : ");
            arrMhs[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan nilai UTS : ");
            arrMhs[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan nilai UAS : ");
            arrMhs[i].nilaiUAS = sc.nextInt();
        }
        
        for(int i=0;i<arrMhs.length;i++){
            System.out.println("Nilai Mahasiswa ke-" + (i+1));
            System.out.println("Nama  : " + arrMhs[i].namaMhs);
            System.out.println("TUGAS : " + arrMhs[i].nilaiTugas);
            System.out.println("KUIS  : " + arrMhs[i].nilaiKuis);
            System.out.println("UTS   : " + arrMhs[i].nilaiUTS);
            System.out.println("UAS   : " + arrMhs[i].nilaiUAS);
            System.out.println("Total Nilai : " + arrMhs[i].hitungTotalNilai());
        }
    }
}
