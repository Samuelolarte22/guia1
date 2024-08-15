/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point5;

/**
 *
 * @author samue
 */
public class AreaCirculo {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);  // A = pi r^2
    }
    
    public static double calcularAreaCoronaCircular(double radioMayor, double radioMenor) {
        double areaCirculoMayor = calcularAreaCirculo(radioMayor);
        double areaCirculoMenor = calcularAreaCirculo(radioMenor);
        return areaCirculoMayor - areaCirculoMenor;
    }
}
