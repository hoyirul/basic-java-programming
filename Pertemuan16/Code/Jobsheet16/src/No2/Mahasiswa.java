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
public class Mahasiswa {
    //mendeklarasikan atribut 
    String nim; 
    String nama; 
    String notelp; 
 
    //membuat konstruktor default    
    public Mahasiswa() { 
         
    } 
 
    //membuat konstruktor berparameter     
    public Mahasiswa(String nim, String nama, String notelp) {    
        this.nim = nim;    
        this.nama = nama;    
        this.notelp = notelp; 
    } 

}
