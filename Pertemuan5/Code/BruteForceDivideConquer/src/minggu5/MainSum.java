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
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah perusahaan: ");
        int perusahaan = sc.nextInt();
        Sum[] sums = new Sum[perusahaan];
        System.out.println("==========================================");
        System.out.println("Program Menghitung Keuntungan Togal (Satuan Juta. Misal 5.9)");
        
        for(int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i +1));
            System.out.print("Masukan jumlah bulan: ");
            int elm = sc.nextInt();
            sums[i] = new Sum(elm);
            System.out.println("==========================================");
            for (int j = 0; j < sums[i].elemen; j++) {
                System.out.print("Masukan untung bulan ke-" + (j + 1) + " = ");
                sums[j].keuntungan[j] =
                sc.nextDouble();
            }
        } 
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i+1));
            System.out.println("=================================== ========");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sums[i].elemen + " bulan adalah "
            + sums[i].totalBF(sums[i].keuntungan));
            System.out.println("=================================== ========");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println(String.format("Total keuntungan perusahaan selama %d bulan adalah " ,
            sums[i].elemen, sums[i].totalDC(sums[i].keuntungan, 0, sums[i].elemen - 1)));
        }
    }
}
