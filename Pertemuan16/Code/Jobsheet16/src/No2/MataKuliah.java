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
public class MataKuliah {
    
    //mendeklarasikan atribut 
    String kode; 
    String matakuliah; 
    String sks; 
     
    //membuat konstruktor default     
    public MataKuliah(){ 
         
    } 
    //membuat konstruktor berparameter     
    public MataKuliah(String kode, String matakuliah, String sks) {         
        this.kode = kode;        
        this.matakuliah = matakuliah;       
        this.sks = sks; 
    } 
}
