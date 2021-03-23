/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number2;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService lists = new PremierLeagueService();
        
        PremierLeague p1 = new PremierLeague("Liverpool      ", 29, 45, 82);
        PremierLeague p2 = new PremierLeague("Mancester City ", 27, 39, 57);
        PremierLeague p3 = new PremierLeague("Licester       ", 28, 26, 50);
        PremierLeague p4 = new PremierLeague("Chelsea        ", 29, 9, 48);
        PremierLeague p5 = new PremierLeague("Wolverhamton   ", 29, 7, 43);
        PremierLeague p6 = new PremierLeague("Sheffield      ", 28, 5, 43);
        PremierLeague p7 = new PremierLeague("MancesterUnited", 28, 12, 42);
        PremierLeague p8 = new PremierLeague("Tottenham      ", 29, 7, 41);
        PremierLeague p9 = new PremierLeague("Arsenal        ", 28, 4, 40);
        PremierLeague p10 = new PremierLeague("burney         ", 29, 6, 39);
        PremierLeague p11 = new PremierLeague("Crystal Palace ", 29, -6, 39);
        PremierLeague p12 = new PremierLeague("Everton        ", 29, -6, 37);
        PremierLeague p13 = new PremierLeague("Newcastel      ", 29, -16, 35);
        PremierLeague p14 = new PremierLeague("Southamton     ", 29, -17, 34);
        PremierLeague p15 = new PremierLeague("Brigton        ", 29, -8, 29);
        PremierLeague p16 = new PremierLeague("West Ham       ", 29, -15, 27);
        PremierLeague p17 = new PremierLeague("Watford        ", 29, -17, 27);
        PremierLeague p18 = new PremierLeague("AFC Bournemoun ", 29, -18, 27);
        PremierLeague p19 = new PremierLeague("Aston Villa    ", 27, -18, 27);
        PremierLeague p20 = new PremierLeague("Norwich City   ", 29, -27, 21);
        
        lists.tambah(p1);
        lists.tambah(p2);
        lists.tambah(p3);
        lists.tambah(p4);
        lists.tambah(p5);
        lists.tambah(p6);
        lists.tambah(p7);
        lists.tambah(p8);
        lists.tambah(p9);
        lists.tambah(p10);
        lists.tambah(p11);
        lists.tambah(p12);
        lists.tambah(p13);
        lists.tambah(p14);
        lists.tambah(p15);
        lists.tambah(p16);
        lists.tambah(p17);
        lists.tambah(p18);
        lists.tambah(p19);
        lists.tambah(p20);
        
        System.out.println("----------------------------");
        System.out.println("DATA SEBELUM DI SORTING");
        System.out.println("----------------------------");
        lists.tampilAll();
        System.out.println("----------------------------");
        
        System.out.println("DATA SETELAH DI SORTING ASC");
        System.out.println("----------------------------");
        lists.insertionSort(true);
        lists.tampilAll();
        System.out.println("----------------------------");
    }
}
