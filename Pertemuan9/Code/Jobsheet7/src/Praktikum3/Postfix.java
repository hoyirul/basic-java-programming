/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

/**
 *
 * @author irulg
 */
public class Postfix {
    int n, top;
    char[] stack;
    
    Postfix(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }
    
    final void push(char c){
        top++;
        stack[top] = c;
    }
    
    char pop(){
        char item = stack[top];
        top--;
        return item;
    }
    
    boolean isOperand(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' && c == '.'){
            return true;
        }else{
            return false;
        }
    }
    
    boolean isOperator(char c){
        if(c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+'){
            return true;
        }else{
            return false;
        }
    }
    
    int derajat(char c){
        switch(c){ 
            case '^': // jika char ^ maka
                return 3; // akan return 3
            case '%': // jika char % maka
                return 2; // akan return 2
            case '/': // jika char / maka
                return 2; // akan return 2
            case '*': // jika char * maka
                return 2; // akan return 2
            case '-': // jika char - maka
                return 1; // akan return 1
            case '+': // jika char + maka
                return 1; // akan return 1
            default: // jika char tidak ada maka
                return 0; // akan return 0
        }
    }
    
    String konversi(String Q){
        String P = "";
        char c;
        
        for(int i=0;i<n;i++){
            c = Q.charAt(i);
            if(isOperand(c)){
                P = P + c;
            }
            if(c == '('){
                push(c);
            }
            if(c == ')'){
                while(stack[top] != '('){
                    P = P + pop(); 
                }
                pop();
            }
            
            if(isOperator(c)){
                while(derajat(stack[top]) >= derajat(c)){
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
    
    
}
