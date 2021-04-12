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
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack st = new Stack(8);
        
        char pilih;
        int x;
        do{
            System.out.println("Pilih operasi ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.print("o> ");
            x = sc.nextInt();

            switch(x){
                case 1:
                    do{
                        System.out.print("Masukkan judul : ");
                        sc.nextLine();
                        String judul = sc.nextLine();
                        System.out.print("Masukkan nama Pengarang : ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan tahun terbit: ");
                        int tahun = sc.nextInt();
                        System.out.print("Masukkan jumlah halaman : ");
                        int jml = sc.nextInt();
                        System.out.print("Masukkan harga buku : ");
                        int hrg = sc.nextInt();

                        Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? : ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        st.push(bk);
                    }while(pilih == 'y');
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
                default:
                    System.out.println("Tidak ada opsi");
            }
        }while(x < 5);
    }
}
