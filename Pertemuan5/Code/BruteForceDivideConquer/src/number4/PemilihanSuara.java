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
public class PemilihanSuara {
    public String[] nama = {
        "Haris", "Dian", "Rani", "Bisma"
    };
    
    public int[] jumlahSuara;
    public int[] tampungSuara;
    int index;
    
    public PemilihanSuara(int elemen) {
        this.jumlahSuara = new int[elemen];
        this.tampungSuara = new int[nama.length];
    } 
    
    public String pilihKetua(int[] array, int l, int r) {
        if(l == r) {
            if(array[l] == 1) {
                tampungSuara[0] += 1;
            } else if(array[l] == 2) {
                tampungSuara[1] += 1;
            } else if(array[l] == 3) {
                tampungSuara[2] += 1;
            } else if(array[l] == 4) {
                tampungSuara[3] += 1;
            }
        } else {
            int mid = (l + r) / 2;
            pilihKetua(array, l, mid);
            pilihKetua(array, mid + 1, r);
            if(tampungSuara[0] > (array.length / 2)) {
                index = 0;
            } else if(tampungSuara[1] > (array.length / 2)){
                index = 1;
            } else if(tampungSuara[2] > (array.length / 2)){
                index = 2;
            } else if(tampungSuara[3] > (array.length / 2)){
                index = 3;
            }
        }
        return nama[index];
    }
    
    public void tampilNama() {
        System.out.println("--------------------------");
        System.out.println("Kandidat Ketua BEM");
        for(int i = 0; i < nama.length; i++) {
            System.out.println((i+1) + ". " + nama[i]);
        }
        System.out.println("--------------------------");
    }
}
