/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point2;

/**
 *
 * @author samue
 */
public class Paseo {
    public static int calcularBusesNecesarios(int sillasPorBus, int gordos, int flacos) {
        
        int sillasNecesarias = (gordos * 2) + flacos;
    
        int busesNecesarios = (int) Math.ceil((double) sillasNecesarias / sillasPorBus);
        return busesNecesarios;
    }
}
