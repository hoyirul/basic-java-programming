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
class MainPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input banyaknya pemilihan : ");
        int elemen = sc.nextInt();
        sc.nextLine();
        PemilihanSuara pemilihanSuara = new
        PemilihanSuara(elemen);
        pemilihanSuara.tampilNama();
        
        for(int i = 0; i < elemen; i++) {
            System.out.print("input pilihan : ");
            pemilihanSuara.jumlahSuara[i] =
            sc.nextInt();
        }
        String terpilih = pemilihanSuara.pilihKetua(pemilihanSuara.jumlahSuara, 0,elemen - 1);
        System.out.println("Terpilih: " + terpilih);
    }
}
