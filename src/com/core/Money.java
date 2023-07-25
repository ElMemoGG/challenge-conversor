/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core;

/**
 *
 * @author omem-
 */
public class Money {
    
    private double[][] values;
    private int type;

    public Money(double[][] values, int type) {
        this.values = values;
        this.type = type;
    }
    
    public double setConvert(double qty, int toType){
        return qty * values[type][toType] ;
    } 
    
    
    
}
