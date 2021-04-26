/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No5;
/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Queue lists = new Queue(); 
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("Masukkan operasi yang di inginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print All");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek Rear");
        System.out.println("7. Keluar");
        System.out.println("------------------");
        System.out.print("o> ");
        int pilih;
        pilih = sc.nextInt();
        sc.nextLine();

        switch(pilih){
            case 1:
                add();
                menu();
                break;
            case 2:
                lists.Dequeue();
                menu();
            case 3:
                lists.print();
                menu();
                break;
            case 4:
                lists.peek();
                menu();
                break;
            case 5:
                //sc.nextLine();
                System.out.print("Masukkan norek  : ");
                String x = sc.nextLine();
                lists.peekPosition(x);
                menu();
                break;
            case 6:
                lists.peekRear();
                menu();
                break;
            default:
                System.out.println("EXIT BERHASIL");
        }
    }
    
    static void add(){
        String norek, nama, alamat;
        System.out.print("Masukkan Norek  : ");
        norek = sc.nextLine();
        System.out.print("Masukkan Nama   : ");
        nama = sc.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = sc.nextLine();
        Nasabah nb = new Nasabah(norek, nama, alamat);
        lists.Enqueue(nb);
        //lists.print();
    }
}