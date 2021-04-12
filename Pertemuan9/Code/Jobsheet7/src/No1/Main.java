/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author irulg
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kalimat : ");
        String kalimat = sc.nextLine();

        Stack reserveStack = new Stack(kalimat.length());

        for (int i = 0; i < kalimat.length(); i++) {
            reserveStack.push(kalimat.charAt(i));
        }

        reserveStack.print();
        System.out.println("");

    }
}
