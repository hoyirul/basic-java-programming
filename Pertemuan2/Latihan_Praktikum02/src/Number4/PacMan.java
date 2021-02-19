/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number4;

/**
 *
 * @author irulg
 */
public class PacMan {
    int x, y, width, height;
    
    void moveLeft(){
        x -= 1;
        if((x < 0)){
            x += 1;
            System.out.println("----------------------------------------");
            System.out.println("Koordinat tidak boleh lebih kecil dari 0");
            System.out.println("----------------------------------------");
        }
        printPosition();
        
    }
    
    void moveRight(){
        x += 1;
        if((x > width-1)){
            x -= 1;
            System.out.println("---------------------------------------------");
            System.out.println("Koordinat tidak boleh lebih besar dari width");
            System.out.println("---------------------------------------------");
        }
        printPosition();
        
    }
    
    void moveUp(){
        y -= 1;
        if((y < 0)){
            y += 1;
            System.out.println("----------------------------------------");
            System.out.println("Koordinat tidak boleh lebih kecil dari 0");
            System.out.println("----------------------------------------");
        }
        printPosition();
    }
    
    void moveDown(){
        y += 1;
        if((y > height-1)){
            y -= 1;
            System.out.println("---------------------------------------------");
            System.out.println("Koordinat tidak boleh lebih besar dari height");
            System.out.println("---------------------------------------------");
        }
        printPosition();
    }
    
    void printPosition(){
        int[][] maps = new int[height][width]; // instansisasi maps pacman
        System.out.println("Koordinat (x = " + x +", y = " + y + ")");
        
        // membuat peta(maps) pacman
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[0].length;j++){
                if((j == x) && (i == y)){ // jika jika baris j == x dan kolom i == y
                    System.out.print("(H)"); // maka akan menampilkan posisi pacman sekarang di koordinat(x, y)
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println("");
        }
    }
}
