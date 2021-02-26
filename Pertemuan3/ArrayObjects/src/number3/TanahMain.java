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
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int n = sc.nextInt();
        Tanah[] tnArr = new Tanah[n];
        Tanah tnObj = new Tanah(); // modified
        tnObj.simpanLuas(n); // modified
        
        for(int i=0;i<tnArr.length;i++){
            System.out.println("---- Tanah " + (i+1) + " ----");
            tnArr[i] = new Tanah(0,0);
        }
        
        System.out.println("------------------------");
        for(int i=0;i<tnArr.length;i++){
            tnObj.luas[i] = tnArr[i].luasTanah(); // modified
            System.out.println("Luas Tanah : " + tnArr[i].luasTanah());
        }
        System.out.println("------------------------");
        
        tnObj.luasTerluas(); // modified
    }
}
