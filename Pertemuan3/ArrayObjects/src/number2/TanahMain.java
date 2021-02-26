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
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int n = sc.nextInt();
        Tanah[] tnArr = new Tanah[n];
        
        for(int i=0;i<tnArr.length;i++){
            System.out.println("---- Tanah " + (i+1) + " ----");
            tnArr[i] = new Tanah(0,0);
        }
        
        for(int i=0;i<tnArr.length;i++){
            System.out.println("Luas : " + tnArr[i].luasTanah());
        }
    }
}
