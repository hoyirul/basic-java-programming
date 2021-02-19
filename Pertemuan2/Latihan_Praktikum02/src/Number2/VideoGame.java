/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number2;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class VideoGame {
    int id, lama_sewa;
    double harga_sewa;
    String nama_member, nama_game;
    
    void detailSewa(){
        System.out.println("Detail Transaksi");
        System.out.println("----------------------------------");
        System.out.println("Nama Member   : " + nama_member);
        System.out.println("ID/Nama Game  : " + id + "/" + nama_game);
        System.out.println("Tarif /hari   : Rp. " + harga_sewa);
        System.out.println("Lama Menyewa  : " + lama_sewa);
        System.out.println("----------------------------------");
        double total = bayar(lama_sewa);
        System.out.println("Total Pembayaran : Rp. " + total);
        System.out.println("----------------------------------");
        konfirmasi(total);
    }
    
    void konfirmasi(double total){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bayar o> Rp. ");
        double byr = sc.nextDouble();
        
        if(byr < total){
            System.out.println("Maaf Uang Anda Kurang Rp." + (total - byr));
            konfirmasi(total);
        }else{
            System.out.println("-----------------------------");
            System.out.println("Pembayaran Berhasil");
            System.out.println("Kembali Rp." + (byr - total));
            System.out.println("-----------------------------");
        }
    }
    
    double bayar(int n){
        double total = n * harga_sewa;
        return total;
    }
}
