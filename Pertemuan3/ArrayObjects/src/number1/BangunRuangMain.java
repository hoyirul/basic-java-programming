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
public class BangunRuangMain {
    public static void main(String[] args) {
        
        Balok[] blArr = new Balok[1];
        Kerucut[] kcArr = new Kerucut[1];
        Kubus[] kbArr = new Kubus[1];
        
        for(int i=0;i<1;i++){
            System.out.println("BALOK");
            blArr[i] = new Balok(0,0,0);
            System.out.println("KUBUS");
            kbArr[i] = new Kubus(0);
            System.out.println("KERUCUT"); 
            kcArr[i] = new Kerucut(0,0);
        }
        
        for(int i=0;i<1;i++){
            System.out.println("-------------------------");
            System.out.println("BALOK");
            System.out.println("Panjang : " + blArr[i].p);
            System.out.println("Lebar   : " + blArr[i].l);
            System.out.println("Tinggi  : " + blArr[i].t);
            System.out.println("Volume  : " + blArr[i].volume());
            System.out.println("Luas Permukaan  : " + blArr[i].luasPermukaan());
            System.out.println("-------------------------");
            
            System.out.println("-------------------------");
            System.out.println("KUBUS");
            System.out.println("Sisi : " + kbArr[i].s);
            System.out.println("Volume  : " + kbArr[i].volume());
            System.out.println("Luas Permukaan  : " + kbArr[i].luasPermukaan());
            System.out.println("-------------------------");
            
            System.out.println("-------------------------");
            System.out.println("KERUCUT");
            System.out.println("Jari Jari : " + kcArr[i].r);
            System.out.println("Tinggi   : " + kcArr[i].t);
            System.out.println("Volume  : " + kcArr[i].volume());
            System.out.println("Luas Permukaan  : " + kcArr[i].luasPermukaan());
            System.out.println("-------------------------");
        }
    }
}