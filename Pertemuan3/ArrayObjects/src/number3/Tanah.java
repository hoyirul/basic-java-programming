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
public class Tanah {
    Scanner sc = new Scanner(System.in);
    public int panjang, lebar;
    public double[] luas; // modified
    
    public Tanah(int panjang, int lebar){
        System.out.print("Panjang : ");
        panjang =  sc.nextInt();
        System.out.print("Lebar   : ");
        lebar =  sc.nextInt();
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // modified
    Tanah() {
        
    }
    
    // modified
    void simpanLuas(int n){
        luas = new double[n];
    }
    
    double luasTanah(){
        return panjang * lebar;
    }
    
    // modified
    void luasTerluas(){
        int count = 0;
        double max = luas[0];
        for(int i = 0;i<luas.length;i++){
            if(luas[i] > max){
                max = luas[i];
                count = i;
            }
            //System.out.println(luas[i] + ", ");
        }
        
        System.out.println("Tanah Terluas : Tanah ke-" + (count+1) + " Luas = " + max);
    }
}
