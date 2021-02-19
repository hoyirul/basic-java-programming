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
public class Barang {
    String nama;
    int hargaSatuan, jumlah;
    
    Barang(){
        System.out.println("Parameter harus ada");
    }
    
    Barang(String n, int h, int j){
        nama = n;
        hargaSatuan = h;
        jumlah = j;
    }
    
    int hitungHargaTotal(){
        return hargaSatuan * jumlah;
    }
    
    int hitungDiskon(){
        int total = hitungHargaTotal();
        int diskon = 0;
        if(total > 100000){
            diskon = (int) (total * 0.10);
        }else if((total > 50000) && (total <= 100000)){
            diskon = (int) (total * 0.05);
        }else{
            diskon = (int) (total * 0);
        }
        return diskon;
    }
    
    int hitungHargaBayar(){
        int total = hitungHargaTotal();
        double diskon = hitungDiskon();
        total -= diskon;
        return total;
    }
}
