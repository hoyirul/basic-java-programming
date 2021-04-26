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
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        SingleLinkedLists lists = new SingleLinkedLists();
        String data, keys;
        int choice;
        
        do {
            menu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    lists.addFirst(data);
                    lists.print();
                    break;
                case 2:
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    lists.addLast(data);
                    lists.print();
                    break;
                case 3:
                    specific();
                    int getSpec;
                    getSpec = sc.nextInt();
                    sc.nextLine();
                    if(getSpec == 1){
                        System.out.print("Enter Data : ");
                        data = sc.nextLine();
                        System.out.print("After Data (Keys) : ");
                        keys = sc.nextLine();
                        lists.insertAfter(keys, data);
                        lists.print();
                    }else if(getSpec == 2){
                        System.out.print("Enter Data : ");
                        data = sc.nextLine();
                        System.out.print("Before Data (Keys) : ");
                        keys = sc.nextLine();
                        lists.insertBefore(keys, data);
                        lists.print();
                    }else{
                        System.out.println("Option does not exist");
                    }
                    break;
                default:
                    System.out.println("Option does not exist");
            }
        } while (choice < 5 || choice > 0);
    }
    
    public static void menu(){
        System.out.println("Choice Operation Single Linked Lists");
        System.out.println("1. Add First Data");
        System.out.println("2. Add Last Data");
        System.out.println("3. Add data in a specific position");
        System.out.print("o> ");
    }
    
    public static void specific(){
        System.out.println("Choice Specification");
        System.out.println("1. Add after");
        System.out.println("2. Add before");
        System.out.print("o> ");
    }
}