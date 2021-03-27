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
public class Sequential {
    int rows, cols;
    int[][] datas = new int[3][5];
    
    void tambah(){
        datas[0][0] = 45;
        datas[0][1] = 78;
        datas[0][2] = 7;
        datas[0][3] = 200;
        datas[0][4] = 80;
        
        datas[1][0] = 90;
        datas[1][1] = 1;
        datas[1][2] = 17;
        datas[1][3] = 100;
        datas[1][4] = 50;
       
        datas[2][0] = 21;
        datas[2][1] = 2;
        datas[2][2] = 40;
        datas[2][3] = 18;
        datas[2][4] = 65;
    }
    
    void tampil(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(datas[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }
    
    int[] FindSeqSearch(int s){
        int arr[] = new int[2];
        int row = -1, col = -1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(datas[i][j] == s){
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        arr[0] = row;
        arr[1] = col;
        return arr;
    }
    
    void TampilPosisi(int x, int row, int col){
        if(row != -1 && col != -1){
            System.out.println("Data " + x + " ditemukan pada baris ke " + row + " dan kolom ke " + col);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    
    void TampilData(int x, int row, int col){
        if(row != -1 && col != -1){
            System.out.println("Nilai  = " + x);
            System.out.println("Data  = " + datas[row][col]);
            System.out.println("Status = DITEMUKAN");
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
