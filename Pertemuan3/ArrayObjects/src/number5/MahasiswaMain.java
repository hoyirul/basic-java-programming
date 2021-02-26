/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number5;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int n = sc.nextInt();
        Mahasiswa[] mhsArr = new Mahasiswa[n];
        Mahasiswa avgIpk = new Mahasiswa(); // modified
        avgIpk.simpanIPK(n); // modified
        
        for(int i=0;i<mhsArr.length;i++){
            System.out.println("---- Mahasiswa ke " + (i+1) + " ----");
            mhsArr[i] = new Mahasiswa("","",'-',0);
        }
        
        System.out.println("");
        
        line(30);
        for(int i=0;i<mhsArr.length;i++){
            avgIpk.avg[i] = mhsArr[i].ipk; // modified
            System.out.println("---- Mahasiswa ke " + (i+1) + " ----");
            System.out.println("Nama Mahasiswa          : " + mhsArr[i].nama);
            System.out.println("NIM Mahasiswa           : " + mhsArr[i].nim);
            System.out.println("Jenis Kelamin Mahasiswa : " + mhsArr[i].jk);
            System.out.println("IPK Mahasiswa           : " + mhsArr[i].ipk);
        }
        line(30);
        avgIpk.averageIPK(); // modified
        line(30);
    }
    
    static void line(int n){
        for(int i=0;i<n;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
}
