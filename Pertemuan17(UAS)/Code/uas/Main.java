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

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Services srv = new Services();
    static String kode, tnkb;
    public static void main(String[] args) throws Exception{
        Kendaraan kd1 = new Kendaraan("P 1029 KH", "Vario  ", "Roda 2", 150, 2018, 2);
        Kendaraan kd2 = new Kendaraan("B 1030 KD", "Bravo  ", "Roda 2", 80, 2012, 5);
        Kendaraan kd3 = new Kendaraan("P 1031 KS", "Supra  ", "Roda 2", 300, 2013, 7);
        Kendaraan kd4 = new Kendaraan("N 1032 KC", "Pajero ", "Roda 4", 700, 2015, 6);
        Kendaraan kd5 = new Kendaraan("L 1033 KV", "XPander", "Roda 4", 1400, 2019, 4);
        Kendaraan kd6 = new Kendaraan("N 1034 KF", "Jazz   ", "Roda 4", 2800, 2016, 1);
        srv.addLastKendaraan(kd1);
        srv.addLastKendaraan(kd2);
        srv.addLastKendaraan(kd3);
        srv.addLastKendaraan(kd4);
        srv.addLastKendaraan(kd5);
        srv.addLastKendaraan(kd6);
        navigasi();
    }
    
    static void navigasi() throws Exception{
        System.out.println("- NAVIGASI MENU -");
        System.out.println("1. Transaksi");
        System.out.println("2. Data Kendaraan");
        System.out.println("3. Data Transaksi");
        System.out.println("4. Keluar");
        System.out.print("o> ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option){
            case 1:
                caseOne();
                navigasi();
                break;
            case 2:
                srv.printKendaraan();
                navigasi();
                break;
            case 3:
                srv.print();
                navigasi();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                navigasi();
                
        }
    }
    
    static void caseOne() throws Exception{
        srv.printKendaraan();
        int ai = srv.size + 1;
        String str = Integer.toString(ai);
        kode = "KD00" + str;
        System.out.println("Kode : " + kode);
        kode = kode;
        System.out.print("TNKB : ");
        tnkb = sc.nextLine();
        
        srv.transaksi(tnkb, kode);
        
        // Mengahpus antrean 
        srv.removeFirstKendaraan();
    }
}
