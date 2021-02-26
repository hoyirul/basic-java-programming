/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number1;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Balok {
    Scanner sc = new Scanner(System.in);
    public double p, l, t;
    
    public Balok(){
        
    }
    
    public Balok(double p, double l, double t){
        System.out.print("Panjang : ");
        p =  sc.nextDouble();
        System.out.print("Lebar   : ");
        l =  sc.nextDouble();
        System.out.print("Tinggi  : ");
        t =  sc.nextDouble();
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    double volume(){
        double v = p * l * t;
        return v;
    }
    
    double luasPermukaan(){
        double lP = p * l;
        return lP;
    }
}
