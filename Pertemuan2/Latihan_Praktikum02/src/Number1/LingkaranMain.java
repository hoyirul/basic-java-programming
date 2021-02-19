/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number1;

/**
 *
 * @author irulg
 */
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.jari = 7;
        double l = l1.hitungLuas();
        double k = l1.hitungKeliling();
        
        System.out.println("Jari-jari          = " + l1.jari);
        System.out.println("Luas Lingkaran     = " + l);
        System.out.println("Keliling Lingkaran = " + k);
    }
}
