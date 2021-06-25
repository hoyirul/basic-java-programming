/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author irulg
 */
public class Node {
    Pajak data;
    Node prev;
    Node next;
    
    Node(Node prev, Pajak data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
