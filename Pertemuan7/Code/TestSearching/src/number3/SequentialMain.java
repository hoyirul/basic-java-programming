/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number3;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
import java.util.Random;
public class SequentialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Sequential data = new Sequential();
        int row = 3, col = 5;
        data.rows = row;
        data.cols = col;
        data.tambah();
        data.tampil();
        
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Pencarian data sequential");
        System.out.print("Masukkan nilai yang akan di cari : ");
        int s = sc.nextInt();        
        System.out.println("menggunakan sequensial search");
        int[] posisi = data.FindSeqSearch(s);
        //System.out.println(posisi[0] + " " + posisi[1]);
        data.TampilPosisi(s, posisi[0], posisi[1]);
        data.TampilData(s, posisi[0], posisi[1]);
    }
    
    // Random interger untuk mengisi data array 2 dimensi agar lebih cepat
    static int randInt(int min, int max) {
        Random rand = null;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
