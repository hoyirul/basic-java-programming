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
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=========================");
        System.out.print("Masukkan nilai yang ingin di hitung : ");
        int elemen = sc.nextInt();
        
        
        Faktorial fk[] = new Faktorial[elemen];
        for(int i=0;i<elemen;i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1));
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("=========================");
        System.out.println("Hasil faktorial dengan BF");
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        
        System.out.println("=========================");
        System.out.println("Hasil faktorial dengan DC");
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
