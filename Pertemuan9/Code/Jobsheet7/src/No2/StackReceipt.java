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
public class StackReceipt {
    int top;
    StackReceipt[] stack;
    int size;

    String noTransaksi;
    int qty;
    int total;
    String waktu;

    public StackReceipt(String noTransaksi, int qty, int total, String waktu) {
        this.noTransaksi = noTransaksi;
        this.qty = qty;
        this.total = total;
        this.waktu = waktu;
    }

    public StackReceipt(int size) {
        this.size = size;
        this.top = -1;
        stack = new StackReceipt[this.size];
    }

    public boolean isEmpty() {
        if(top <= -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(top >= size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(StackReceipt st) {
        if (!isFull()) {
            top++;
            stack[top] = st;
        } else {
            System.out.println("Data sudah full!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            StackReceipt stk;
            stk = stack[top];
            top--;
            garis(50);
            System.out.printf("No Transaksi: %-10s\n", stk.noTransaksi);
            System.out.printf("Tanggal: %-20s\n", stk.waktu);
            garis(50);
            System.out.printf("Qty : %-6d | Total: Rp. %d\n", stk.qty, stk.total);
            garis(50);
        }
    }

    public void garis(int pjg) {
        for (int i = 0; i < pjg; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void print() {
        garis(50);
        System.out.println("\t\tISI STACK ");
        garis(50);
        for (int i = top; i >= 0 ; i--) {
            garis(50);
            System.out.printf("Nomor Transaksi: %-10s\n", stack[i].noTransaksi);
            System.out.printf("Tanggal: %-20s\n", stack[i].waktu);
            garis(50);
            System.out.printf("Qty : %-6d | Total: Rp. %d\n", stack[i].qty, stack[i].total);
            garis(50);
        }
        System.out.println();
    }
}
