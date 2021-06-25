/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author irulg
 */
public class Kendaraan {
    String tnkb, nama, jenis;
    int tahun, cc, bulanTax;
    
    public Kendaraan(String tnkb, String nama, String jenis, int cc, int tahun, int bulanTax){
        this.tnkb = tnkb;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanTax = bulanTax;
    }
}
