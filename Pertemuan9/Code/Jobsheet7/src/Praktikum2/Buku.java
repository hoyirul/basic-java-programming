/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author irulg
 */
public class Buku {
    String judul, namaPengarang;
    int tahunTerbit, jmlHalaman, harga;
    
    Buku(String jd, String nm, int thn, int hal, int hg){
        judul = jd;
        namaPengarang = nm;
        tahunTerbit = thn;
        jmlHalaman = hal;
        harga = hg;
    }
}
