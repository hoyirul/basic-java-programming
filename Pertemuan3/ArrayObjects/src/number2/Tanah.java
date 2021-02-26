/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number2;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Tanah {
    Scanner sc = new Scanner(System.in);
    public int panjang, lebar;
    
    public Tanah(int panjang, int lebar){
        System.out.print("Panjang : ");
        panjang =  sc.nextInt();
        System.out.print("Lebar   : ");
        lebar =  sc.nextInt();
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    double luasTanah(){
        return panjang * lebar;
    }
}
