/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number2;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class VideoGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoGame vd1 = new VideoGame();
        
        String[] game = {"Contra    ", "Downhill  ", "Metal Slug", "PES/VIVA  "};
        double[] harga = {5000, 3500, 6500, 8000};
        
        System.out.println("Nama Member");
        System.out.print("o> ");
        vd1.nama_member = sc.nextLine();
        
        System.out.println(".:: Data Game ::.");
        System.out.println("------------------------------------");
        System.out.println("ID  Nama Game    Harga");
        System.out.println("------------------------------------");
        
        for(int i=0;i<4;i++){
            System.out.println((i+1) + ".  " + game[i] + " - Rp. " + harga[i] + "/hari");
        }
        System.out.println("------------------------------------");
        
        System.out.println("Pilih ID game ");
        System.out.print("o> ");
        vd1.id = sc.nextInt();
        System.out.println("Lama Menyewa");
        System.out.print("o> ");
        vd1.lama_sewa = sc.nextInt();
        
        // detail
        vd1.id = (vd1.id);
        vd1.nama_game = game[vd1.id-1];
        vd1.harga_sewa = harga[vd1.id-1];
        
        vd1.detailSewa();
    }
}
