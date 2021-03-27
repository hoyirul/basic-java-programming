/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number4;

/**
 *
 * @author irulg
 */
public class Process {
    Data datas[] = new Data[10];
    int idx;
    
    void tambah(Data m){
        if(idx < datas.length){
            datas[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil(){
        for(Data m : datas){
            System.out.print(m.arr + ",  ");
        }
        System.out.println();
    }
    
    void selectionSort(){
        for(int i=0;i<datas.length-1;i++){
            int idx = i;
            for(int j=i+1;j<datas.length;j++){
                if(datas[j].arr < datas[idx].arr){
                    idx = j;
                }
            }
            Data temp = datas[idx];
            datas[idx] = datas[i];
            datas[i] = temp;
        }
    }
    
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+ right) / 2;
            if(cari == datas[mid].arr){
                return mid;
            }else if(datas[mid].arr > cari){
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1,right);
            }
        }
        return -1;
    }
    
    void arrMax(){
        int max = datas[0].arr, cou = 0;
        
        for(int i=0;i<datas.length;i++){
            if(datas[i].arr > max){
                max = datas[i].arr;
            }
        }
        System.out.println("Nilai Terbesar = "+ max);
        
        //Berapa banyak nilai terbesar
        for(int i=0;i<datas.length;i++){
            if(max == datas[i].arr){
                cou++;
                System.out.println("Pada index ke-" + i);
            }
        }
        
        System.out.println("Jumlah Nilai Terbesar = "+ cou);
    }
    
    void TampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("Data " + x + " ditemukan pada index " + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    
    void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("Data Input  = " + x);
            System.out.println("Data = " + datas[pos].arr);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
