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
public class Stack {
    char[] stack;
    int top;
    int size;

    public Stack(int size) {
        this.size = size;
        stack = new char[this.size];
        top = -1;
    }

    public boolean isFull() {
        if(top >= size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(top <= -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char c) {
        if (!isFull()) {
            top++;
            stack[top] = c;
        } else {
            System.out.println("Data sudah full!");
        }
    }

    public void print() {
        for (int i = top; i >= 0 ; i--) {
            System.out.print(stack[i] + "");
        }
    }
}
