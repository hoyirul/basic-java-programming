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
import java.util.Scanner;
public class MainTiket {
    static TiketService lists = new TiketService();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Tiket t1 = new Tiket("Adam Air    ", 2000000, "Indonesia", "Korea");
        Tiket t2 = new Tiket("Avistar     ", 2600000, "Indonesia", "Japan");
        Tiket t3 = new Tiket("Batavia Air ", 3399999, "Indonesia", "Britania Raya");
        Tiket t4 = new Tiket("Garuda Air  ", 2900000, "Indonesia", "Spain");
        Tiket t5 = new Tiket("Batik Air   ", 2700000, "Indonesia", "Protugal");
        Tiket t6 = new Tiket("Kalstar Air ", 3199999, "Indonesia", "Germany");
        Tiket t7 = new Tiket("Star Air    ", 1099999, "Indonesia", "Singapore");
        Tiket t8 = new Tiket("Trans Air   ", 3570000, "Indonesia", "United States");
        Tiket t9 = new Tiket("Xpress Air  ", 1899999, "Indonesia", "Qatar");
        Tiket t10 = new Tiket("Wings Air   ", 1599999, "Indonesia", "China");
        
        lists.tambah(t1);
        lists.tambah(t2);
        lists.tambah(t3);
        lists.tambah(t4);
        lists.tambah(t5);
        lists.tambah(t6);
        lists.tambah(t7);
        lists.tambah(t8);
        lists.tambah(t9);
        lists.tambah(t10);
        
        System.out.println("DATA SEBELUM DI SORTING ");
        System.out.println("------------------------");
        lists.tampilAll();
        System.out.println("------------------------");
        
        features();
    }
    
    static void features(){
        System.out.println("- FITUR MASKAPAI -");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("o> ");
        int option = sc.nextInt();
        
        switch(option){
            case 1:
                sortBy("BUBBLE SORT", option);
                break;
            case 2:
                sortBy("SELECTION SORT", option);
                break;
            default:
                System.out.println("Opsi Tidak ada!!");
                features();
        }
    }
    
    static void sortBy(String str, int option){
        System.out.println("- " + str + " SORT BY -");
        System.out.println("1. ASCENDING");
        System.out.println("2. DESCENDING");
        System.out.print("o> ");
        int x = sc.nextInt();
        
        if(option == 1){
            switch(x){
                case 1:
                    bubble(true);
                    break;
                case 2:
                    bubble(false);
                    break;
                default:
                    System.out.println("Opsi Tidak ada!!");
                    sortBy(str, option);
            }
        }else{
            switch(x){
                case 1:
                    selection(true);
                    break;
                case 2:
                    selection(false);
                    break;
                default:
                    System.out.println("Opsi Tidak ada!!");
                    sortBy(str, option);
            }
        }
    }
    
    static void bubble(boolean bool){
        System.out.println("------- BUBBLESORT --------");
        System.out.println("DATA SETELAH DI SORTING " + (bool == false ? "DESC" : "ASC"));
        System.out.println("----------------------------");
        lists.bubbleSort(bool);
        lists.tampilAll();
        System.out.println("----------------------------");
    }
    
    static void selection(boolean bool){
        System.out.println("------- SELECTIONSORT --------");
        System.out.println("DATA SETELAH DI SORTING " + (bool == false ? "DESC" : "ASC"));
        System.out.println("----------------------------");
        lists.selectionSort(bool);
        lists.tampilAll();
        System.out.println("----------------------------");
    }
}
