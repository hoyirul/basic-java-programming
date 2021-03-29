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
public class NilaiAlgoritma {
    String namaMhs;
    int nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS;
    //Tugas 30%, Kuis 20%, UTS 20%, UAS 30%
    
    double hitungTotalNilai(){
        double total = 0;
        double nilTugas = (nilaiTugas * 0.30);
        double nilKuis = (nilaiKuis * 0.20);
        double nilUTS = (nilaiUTS * 0.20);
        double nilUAS = (nilaiUAS * 0.30);
        total = nilTugas + nilKuis + nilUTS + nilUAS;
        return total;
    }
    
    double avgBF(double nilTotal, int n){
        double sum = 0;
        for(int i=0;i<n;i++){
            sum += nilTotal;
        }
        double avg = sum / n;
        return avg;
    }
}