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
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Scanner;

public class ReceiptMain {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Date waktu = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, dd MMMM YYYY");


        StackReceipt struk = new StackReceipt(8);
        StackReceipt[] stk = new StackReceipt[8];

        String date = simpleDateFormat.format(waktu);

        stk[0] = new StackReceipt("NT0001", 12, 1200000, date);
        stk[1] = new StackReceipt("NT0002", 2, 1100000, date);
        stk[2] = new StackReceipt("NT0003", 21, 1500000, date);
        stk[3] = new StackReceipt("NT0004", 3, 160000, date);
        stk[4] = new StackReceipt("NT0005", 5, 1298000, date);
        stk[5] = new StackReceipt("NT0006", 10, 200000, date);
        stk[6] = new StackReceipt("NT0007", 9, 3200000, date);
        stk[7] = new StackReceipt("NT0008", 8, 1800000, date);

        for (int i = 0; i < struk.size; i++) {
            struk.push(stk[i]);
        }

        struk.print();

        struk.garis(50);
        System.out.println("\tData yang di pop(struk 5 minggu)");
        struk.garis(50);
        for (int i = 0; i < 5; i++) {
            struk.pop();
        }

        struk.print();
    }
}

