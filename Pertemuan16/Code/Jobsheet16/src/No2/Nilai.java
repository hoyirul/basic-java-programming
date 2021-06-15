/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author irulg
 */
public class Nilai {
    
    //mendeklarasikan atribut 
    String kodenilai; 
    String kodematakuliah; 
    String nimmhs; 
    Float nilai; 
     
    //membuat konstruktor default    
    public Nilai() { 
         
    } 
     
    //membuat konstruktor berparameter    
    Nilai(String kodenilai, float nilai, String kodematakuliah, String nimmhs) {       
        this.kodenilai = kodenilai;        
        this.nilai = nilai;        
        this.kodematakuliah = kodematakuliah;        
        this.nimmhs = nimmhs; 
    } 
}
