/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan NAMA  : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan ABSEN : ");
                    int absen = sc.nextInt();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc.nextDouble();
                    
                    Mahasiswa dt = new Mahasiswa(nim, nama, absen, ipk);
                    Q.Enqueue(dt);
                    sc.nextLine();
                    break;
                case 2:
                    Mahasiswa data = Q.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama)
                      && data.absen != 0 && data.ipk != 0){
                        System.out.println("Antrian yang keluar : " + data.nim + " " + data.nama
                        + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    //sc.nextLine();
                    System.out.print("Masukkan nim  : ");
                    String x = sc.nextLine();
                    Q.peekPosition(x);
                    break;
                case 6:
                    Q.peekRear();
                    break;
                case 7:
                    System.out.print("Masukkan index(no antrian)  : ");
                    int y = sc.nextInt();
                    Q.printMahasiswa(y);
                    break;
                case 8:
                    Q.clear();
                    break;
            }
        }while(pilih < 9 || pilih > 0);
    }
    
    public static void menu(){
        System.out.println("Masukkan operasi yang di inginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print All");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek Rear");
        System.out.println("7. Print Mahasiswa");
        System.out.println("8. Clear");
        System.out.println("------------------");
        System.out.print("o> ");
    }
}
