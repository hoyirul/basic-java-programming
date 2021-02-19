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
public class Lingkaran {
    double jari, phi;
    
    double hitungLuas(){
        if(jari % 7 == 0){
            phi = 22/7;
        }else{
            phi = 3.14;
        }
        double luas = phi * jari * jari;
        return luas;
    }
    
    double hitungKeliling(){
        if(jari % 7 == 0){
            phi = 22/7;
        }else{
            phi = 3.14;
        }
        double keliling = 2 * phi * jari;
        return keliling;
    }
}
