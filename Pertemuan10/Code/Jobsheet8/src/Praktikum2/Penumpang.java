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
public class Penumpang {
    String nama, kotaAsal, kotaTujuan;
    int jumlahTiket, harga;
    
    Penumpang(String nama, String kotaAsal, String kotaTujuan, int jml, int harga){
        this.nama = nama;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.jumlahTiket = jml;
        this.harga = harga;
    }
}
