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
public class Pajak {
    String kode, tnkb;
    double nominal, denda;
    int bulanTax;
    
    public Pajak(String kode, String tnkb, double nominal, double denda, int bulanTax){
        this.kode = kode;
        this.tnkb = tnkb;
        this.nominal = nominal;
        this.denda = denda;
        this.bulanTax = bulanTax;
    }
}
