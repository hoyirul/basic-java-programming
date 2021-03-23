/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author irulg
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil(){
        for(Mahasiswa m : listMhs){
            //System.out.println(m.nama + "  " + m.thnMasuk + "  " + m.umur + "  " + m.ipk);
            m.tampil();
            System.out.println("------------------------");
        }
    }
    
    void bubbleSort(){
        for(int i=0;i<listMhs.length-1;i++){
            for(int j=1;j<listMhs.length-i;j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
    
    void selectionSort(){
        for(int i=0;i<listMhs.length-1;i++){
            int idx = i;
            for(int j=i+1;j<listMhs.length;j++){
                if(listMhs[j].ipk < listMhs[idx].ipk){
                    idx = j;
                }
            }
            Mahasiswa temp = listMhs[idx];
            listMhs[idx] = listMhs[i];
            listMhs[i] = temp;
        }
    }
    
    void insertionSort(){
        for(int i=1;i<listMhs.length;i++){
            Mahasiswa temp = listMhs[i];
            int j = i;               
            while(j > 0 && listMhs[j].ipk > temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
