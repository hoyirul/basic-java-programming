/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat png[] = new Pangkat[elemen];
        
        for(int i=0;i<elemen;i++){
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        
        System.out.println("-------------MENU----------------");
        System.out.println("1. Hitung dengan Brute Force");
        System.out.println("2. Hitung dengan Devide Conquer");
        System.out.print("o> ");
        int option = sc.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Hasil Pangkat dengan BruteForce");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah " +
                    png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah " +
                    png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Tidak ada pilihan");
        }
    }
}
