/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core;

/**
 *
 * @author omem-
 */
public class Operations {
    
    private Temperatura temp;

    public Operations(Temperatura temp) {
        this.temp = temp;
    }
    
    public double changesTemps(int type){
        
        return switch (temp.getType()) {
            case 0 -> fromC(type);
            case 1 -> fromK(type);
            case 2 -> fromF(type);
            default -> 0;
        };
    }
 //Celsius,  k, Fahrenheit
    private double fromC(int type) {
        return switch (type) {
            case 0 ->  temp.getGrados() ;
            case 1 ->  temp.getGrados() + 273.15;
            case 2 -> (temp.getGrados() * 1.8) +32 ;
            default -> 0;
        };
    }
    private double fromK(int type) {
        return switch (type) {
            case 0 ->  temp.getGrados() - 273.15;
            case 1 ->  temp.getGrados();
            case 2 -> 1.8 * (temp.getGrados()-273) +32 ;
            default -> 0;
        };
    }
    private double fromF(int type) {
        return switch (type) {
            case 0 ->  (temp.getGrados()-32) /1.8;
            case 1 ->  ((temp.getGrados() -32) /1.8) + 273.15;
            case 2 -> temp.getGrados() ;
            default -> 0;
        };
    }
    
}
