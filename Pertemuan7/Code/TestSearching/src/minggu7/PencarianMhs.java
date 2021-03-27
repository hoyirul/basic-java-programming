/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author irulg
 */
public class PencarianMhs {
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
    
    int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j=0;j<listMhs.length;j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+ right) / 2;
            if(cari == listMhs[mid].nim){
                return mid;
            }else if(listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1,right);
            }
        }
        return -1;
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
            System.out.println("NIM  = " + x);
            System.out.println("Nama = " + listMhs[pos].nama);
            System.out.println("Umur = " + listMhs[pos].umur);
            System.out.println("IPK  = " + listMhs[pos].ipk);
            }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
