/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class MainTransaksi {
    static Scanner sc = new Scanner(System.in);
    static Proses data = new Proses();
    static int session;
    public static void main(String[] args) {
        dataRek();
        dataTransaksi();
        menu();
    }

    static void dataRek(){
        Rekening r1 = new Rekening("160309273084","bin Abdul Salam","Aruffin ","14582643263","ligula.Nullam@tacitisociosqu.edu");
        Rekening r2 = new Rekening("169712042416","Al Hafeezy","Mohammad     ","16834168323","ut.pellentesque@luctusutpellentesque.com");
        Rekening r3 = new Rekening("161007278862","bin Azzarudin","Ehsan     ","6505379","Proin.eget@velitegestaslacinia.ca");
        Rekening r4 = new Rekening("161807297229","Fadhullah","Jeanne Roselia","8638209","Pellentesque.ut.ipsum@neque.ca");
        Rekening r5 = new Rekening("169503136823","Nohara","Shinnosuke       ","5926919","tellus.justo.sit@commodoauctor.net");
        Rekening r6 = new Rekening("168507083528","Nohara","Hiroshi          ","11153397678","dictum@nec.edu");
        Rekening r7 = new Rekening("160802059329","Nohara","Misae            ","18917032664","vel@ullamcorpermagna.co.uk");
        Rekening r8 = new Rekening("160806282695","Nohara","Himawari         ","19786325110","Aliquam.gravida@vestibulumMauris.net");
        Rekening r9 = new Rekening("161309092979","Nobi","Nobita             ","8171766","interdum.Curabitur.dictum@rutrumurna.edu");
        Rekening r10 = new Rekening("168902128688","Takeshi","Goda           ","16754004501","et.ultrices@a.co.uk");
        Rekening r11 = new Rekening("161410089963","Kudo","Shinichi          ","5279085","ut@aultriciesadipiscing.ca");
        Rekening r12 = new Rekening("165112227763","Ai","Haibara             ","15644194285","Proin.velit@Duisac.net");
        Rekening r13 = new Rekening("167206230943","Mouri","Ran              ","9776690","ac@nibhAliquamornare.com");
        Rekening r14 = new Rekening("167711267372","Mouri","Kogoro           ","3535137","cubilia.Curae.Phasellus@Duis.com");
        
        
        data.addRekening(r1);
        data.addRekening(r2);
        data.addRekening(r3);
        data.addRekening(r4);
        data.addRekening(r5);
        data.addRekening(r6);
        data.addRekening(r7);
        data.addRekening(r8);
        data.addRekening(r9);
        data.addRekening(r10);
        data.addRekening(r11);
        data.addRekening(r12);
        data.addRekening(r13);
        data.addRekening(r14);
    }
    
    static void dataTransaksi(){
        Transaksi t1 = new Transaksi(898214,494048,3587,"Deposit", "2021-03-09 07:54:42");
        Transaksi t2 = new Transaksi(770592,334245,444267,"Deposit","2020-08-11 13:36:56");
        Transaksi t3 = new Transaksi(685302,451002,376442,"Deposit","2020-05-23 07:34:53");
        Transaksi t4 = new Transaksi(297103,396116,779589,"Deposit","2021-07-03 01:09:49");
        Transaksi t5 = new Transaksi(66190,259150,619774,"Deposit","2021-09-09 03:57:30");
        Transaksi t6 = new Transaksi(234301,278309,547922,"Deposit","2021-08-24 13:18:39");
        Transaksi t7 = new Transaksi(243306,869468,50283,"Deposit","2021-03-12 03:40:16");
        Transaksi t8 = new Transaksi(371045,991242,602034,"Deposit","2021-08-06 11:48:59");
        Transaksi t9 = new Transaksi(395170,97058,472273,"Deposit","2021-05-02 10:53:31");
        Transaksi t10 = new Transaksi(862731,561908,109431,"Deposit","2021-07-31 08:11:00");
        Transaksi t11 = new Transaksi(556798,31387,725426,"Deposit","2021-03-27 06:18:20");
        Transaksi t12 = new Transaksi(873982,896213,846142,"Deposit","2021-07-18 04:06:30");
        Transaksi t13 = new Transaksi(774247,739406,775848,"Deposit","2020-10-24 01:39:00");
        Transaksi t14 = new Transaksi(66987,823014,868772,"Deposit","2020-12-21 05:57:59");
        
        data.addTransaksi(t1);
        data.addTransaksi(t2);
        data.addTransaksi(t3);
        data.addTransaksi(t4);
        data.addTransaksi(t5);
        data.addTransaksi(t6);
        data.addTransaksi(t7);
        data.addTransaksi(t8);
        data.addTransaksi(t9);
        data.addTransaksi(t10);
        data.addTransaksi(t11);
        data.addTransaksi(t12);
        data.addTransaksi(t13);
        data.addTransaksi(t14);
    }
    
    static void menu(){
        System.out.println(".: Menu Teller :.");
        System.out.println("1. Tampilkan data rekening");
        System.out.println("2. Tampilkan data transaksi");
        System.out.println("3. Mencari saldo > 500.000");
        System.out.println("4. Mencari data [norek]");
        System.out.println("5. Sorting by name");
        System.out.println("6. Keluar");
        System.out.print("o> ");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                data.showRekening();
                menu();
                break;
            case 2:
                data.showTransaksi();
                menu();
                break;
            case 3:
                System.out.println("MENCARI DATA SALDO DI ATAS 500K");
                data.FindSeqSearch(500000);
                menu();
                break;
            case 4:
                findNorek();
                menu();
                break;
            case 5:
                boolean bool = sortBy();
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("MENGURUTKAN DATA BERDASAR NAMA SORT BY " + (bool == true ? "DESC" : "ASC"));
                System.out.println("--------------------------------------------------------------------------");
                data.sorting(bool);
                data.showRekening();
                menu();
                break;
            case 6:
                menu();
                break;
            default:
                System.out.println("Opsi tidak ada!");
                menu();
        }
    }
    
    static void findNorek(){
        System.out.println("---------------------------");
        System.out.println("Cari Berdasaran No Rekening");
        System.out.println("---------------------------");
        System.out.println("Masukkan No Rekening ");
        System.out.print("o> ");
        sc.nextLine();
        String norek = sc.nextLine();
        data.check(norek);
    }
    
    static boolean sortBy(){
        boolean bool = false;System.out.println(".: SORT BY :.");
        System.out.println("1. DESCENDING");
        System.out.println("2. ASCENDING");
        System.out.print("o> ");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                bool = true;
                break;
            case 2:
                bool = false;
                break;
            default:
                System.out.println("Opsi Tidak ada");
                sortBy();
        }
        return bool;
    }
}
