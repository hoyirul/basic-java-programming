/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author irulg
 */
public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    public Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    } 
    
    public double totalBF(double arr[]) {
        for(int i = 0; i < elemen; i++) {
        total = total + arr[i];
        }return total;
    } 
    
    public double totalDC(double arr[], int l, int r) {
        if(l == r) {
            return arr[l];
        }else if(l<r) {
            int mid = (l+r) / 2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}