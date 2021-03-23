/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number1;

/**
 *
 * @author irulg
 */
public class TiketService {
    public Tiket[] tikets = new Tiket[10];
    public int ctx;
    
    void tambah(Tiket m){
        if(ctx < tikets.length){
            tikets[ctx] = m;
            ctx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampilAll(){
        for(Tiket m : tikets){
            System.out.println(m.maskapai + "  " + m.harga + "  " + m.asal + "  " + m.tujuan);
        }
    }
    
    void bubbleSort(boolean bool){
        for(int i=0;i<tikets.length-1;i++){
            for(int j=1;j<tikets.length-i;j++){
                if(bool == false){
                    if(tikets[j].harga > tikets[j-1].harga){
                        Tiket temp = tikets[j];
                        tikets[j] = tikets[j-1];
                        tikets[j-1] = temp;
                    }
                }else{
                    if(tikets[j].harga < tikets[j-1].harga){
                        Tiket temp = tikets[j];
                        tikets[j] = tikets[j-1];
                        tikets[j-1] = temp;
                    }
                }
            }
        }
    }
    
    void selectionSort(boolean bool){
        for(int i=0;i<tikets.length-1;i++){
            int idx = i;
            for(int j=i+1;j<tikets.length;j++){
                if(bool == false){
                    if(tikets[j].harga > tikets[idx].harga){
                        idx = j;
                    }
                }else{
                    if(tikets[j].harga < tikets[idx].harga){
                        idx = j;
                    }
                }
            }
            Tiket temp = tikets[idx];
            tikets[idx] = tikets[i];
            tikets[i] = temp;
        }
    }
}
