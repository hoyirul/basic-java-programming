/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number3;

/**
 *
 * @author irulg
 */
public class BarangMain {
    public static void main(String[] args) {
        
        // tanpa diskon
        Barang brg = new Barang("Gula", 4000, 8);
        
        System.out.println("---------------------------------");
        System.out.println("Nama Item   : " + brg.nama);
        System.out.println("Harga Item  : Rp. " + brg.hargaSatuan);
        System.out.println("Jumlah Item : " + brg.jumlah);
        System.out.println("---------------------------------");
        System.out.println("Total Bayar : Rp. " + brg.hitungHargaBayar());
        System.out.println("---------------------------------");
        
        System.out.println("");
        // diskon 5 %
        Barang brg1 = new Barang("Saos Jaja", 7600, 8);
        
        System.out.println("---------------------------------");
        System.out.println("Nama Item   : " + brg1.nama);
        System.out.println("Harga Item  : Rp. " + brg1.hargaSatuan);
        System.out.println("Jumlah Item : " + brg1.jumlah);
        System.out.println("---------------------------------");
        System.out.println("Total Bayar : Rp. " + brg1.hitungHargaBayar());
        System.out.println("---------------------------------");
        
        System.out.println("");
        // diskon 10 %
        Barang brg2 = new Barang("Kecap Manis", 10500, 12);
        
        System.out.println("---------------------------------");
        System.out.println("Nama Item   : " + brg2.nama);
        System.out.println("Harga Item  : Rp. " + brg2.hargaSatuan);
        System.out.println("Jumlah Item : " + brg2.jumlah);
        System.out.println("---------------------------------");
        System.out.println("Total Bayar : Rp. " + brg2.hitungHargaBayar());
        System.out.println("---------------------------------");
    }
}
