/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irulg
 */
public class Proses {
    Rekening[] reks = new Rekening[14];
    Transaksi[] trans = new Transaksi[14];
    int rekIdx, traIdx;
    
    void addRekening(Rekening m){
        if(rekIdx < reks.length){
            reks[rekIdx] = m;
            rekIdx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void addTransaksi(Transaksi m){
        if(traIdx < trans.length){
            trans[traIdx] = m;
            traIdx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void showRekening(){
        System.out.println("No Rek\t\t  Nama Lengkap\t\t\t  Phone\t\t Email");
        System.out.println("-----------------------------------------------------------------------");
        for(Rekening m : reks){
            System.out.println(m.noRekening + "\t  " + m.namaDepan + " " + m.namaBelakang + "\t  " + m.phone + "\t " + m.email);
        }
        System.out.println("-----------------------------------------------------------------------");
    }
    
    void showTransaksi(){
        System.out.println("No Rek\t\t Saldo\t\t SaldoAwal\t SaldoAkhir\t Type\t\t Tanggal");
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i=0;i<trans.length;i++){
            System.out.println(reks[i].noRekening + "\t " + trans[i].saldo + "\t " + trans[i].saldoAwal + "\t " 
                    + trans[i].saldoAkhir + "\t " + trans[i].type + "\t " + trans[i].tanggalTransaksi);
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
    void FindSeqSearch(int cari){
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i=0;i<trans.length;i++){
            if(trans[i].saldo > cari){
                System.out.println(reks[i].noRekening + "\t " + trans[i].saldo + "\t " + trans[i].saldoAwal + "\t " 
                    + trans[i].saldoAkhir + "\t " + trans[i].type + "\t " + trans[i].tanggalTransaksi);
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
    void check(String cari){
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i=0;i<reks.length;i++){
            if(reks[i].noRekening.equals(cari)){
                System.out.println("No Rekening   : " + reks[i].noRekening);
                System.out.println("Nama Pemilik  : " + reks[i].namaDepan + " " + reks[i].namaBelakang);
                System.out.println("Saldo\t\t SaldoAwal\t SaldoAkhir\t Type\t\t Tanggal");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println(trans[i].saldo + "\t " + trans[i].saldoAwal + "\t " 
                    + trans[i].saldoAkhir + "\t " + trans[i].type + "\t " + trans[i].tanggalTransaksi);
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
    void sorting(boolean bool){
        int size = reks.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<reks.length; j++) {
                if(bool == false){
                    if(reks[i].namaDepan.compareToIgnoreCase(reks[j].namaDepan)>0) {
                        String temp = reks[i].namaDepan;
                        reks[i].namaDepan = reks[j].namaDepan;
                        reks[j].namaDepan = temp;
                    }
                }else{
                    if(reks[i].namaDepan.compareToIgnoreCase(reks[j].namaDepan)<0) {
                        String temp = reks[i].namaDepan;
                        reks[i].namaDepan = reks[j].namaDepan;
                        reks[j].namaDepan = temp;
                    }
                }
            }
        }
    }
}
