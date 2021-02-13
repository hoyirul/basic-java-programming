import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        double saldo = 1000000;
        int count = 0;

        System.out.println("---------------------------------------------------------------");
        for(int i=0;saldo<=1500000;i++){
            count++;
            System.out.println("Bulan ke-" + (i+1) + " saldo anda sebesar Rp " + Math.ceil(saldo));
            saldo = saldo + (saldo*0.02);
        }
        System.out.println("---------------------------------------------------------------");

        System.out.println("PADA BULAN KE - " + count);
    }
}