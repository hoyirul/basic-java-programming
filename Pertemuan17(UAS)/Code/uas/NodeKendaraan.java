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
public class NodeKendaraan {
    Kendaraan data;
    NodeKendaraan prev;
    NodeKendaraan next;
    
    NodeKendaraan(NodeKendaraan prev, Kendaraan data, NodeKendaraan next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
