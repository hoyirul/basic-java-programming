/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number4;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class PacManMain {
    static Scanner sc = new Scanner(System.in); // instansisasi scanner -> input
    static PacMan pc = new PacMan(); // membuat object baru(instansiasi)
    public static void main(String[] args) {
        System.out.println(".:: GAME PACMAN ::.");
        System.out.println("KETERANGAN -> (H) sebagai PacMan");
        try{
            System.out.print("Masukkan Tinggi Arena : ");
            pc.height = sc.nextInt();
            System.out.print("Masukkan Lebar Arena  : ");
            pc.width = sc.nextInt();
            pc.x = 0; // koordinat x
            pc.y = 0; // koordinat y
            pc.printPosition(); // posisi awal pacman di koordinat(0,0)
            tampil();
        }catch(Exception e){
            System.out.println("MAAF INPUTAN HARUS ANGKA");
            sc.next();
        }
    }
    
    static void tampil(){
        
        System.out.println("Pilih shortcut untuk langkah PacMan");
        System.out.println("(L/l). Move Left");
        System.out.println("(R/r). Move Right");
        System.out.println("(U/u). Move Up");
        System.out.println("(D/d). Move Down");
        System.out.print("o> ");
        char option = sc.next().charAt(0);
        if(option == 'L' || option == 'l'){
            pc.moveLeft();
        }else if(option == 'R' || option == 'r'){
            pc.moveRight();
        }else if(option == 'U' || option == 'u'){
            pc.moveUp();
        }else if(option == 'D' || option == 'd'){
            pc.moveDown();
        }else{
            System.out.println("MAAF PILIHAN SHORTCUT TIDAK ADA");
        }
        
        tampil();
    }
}
