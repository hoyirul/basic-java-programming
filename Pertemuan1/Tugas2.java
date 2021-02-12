import java.util.Scanner;
public class Tugas2 {
    
    static double hitungBunga(double saldo, int tahun){
        if(tahun == 0){
            return (saldo);
        }else{
            return (1.11 * hitungBunga(saldo, tahun - 1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah saldo awal : ");
        double saldoAwal = sc.nextDouble();
        System.out.print("Lamanya menabung (tahun) : ");
        int tahun = sc.nextInt();
        
        System.out.print("Jumlah uang setelah " + tahun + " tahun :  ");
        System.out.println((int) hitungBunga(saldoAwal, tahun));
    }
}