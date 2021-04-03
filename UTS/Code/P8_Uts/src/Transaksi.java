/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author irulg
 */
public class Transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;
    
    Transaksi(double saldo, double saldoAwal, double saldoAkhir, String type, String tanggalTransaksi){
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.type = type;
        this.tanggalTransaksi = tanggalTransaksi;
    }
}
