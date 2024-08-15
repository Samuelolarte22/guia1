/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point3;

/**
 *
 * @author samue
 */
public class Escalera {
    public static double calcularLongitudEscalera(double altura, double angulo) {
        double anguloEnRadianes = Math.toRadians(angulo);
        //fórmula y = x / sin(alpha)
        double longitudEscalera = altura / Math.sin(anguloEnRadianes);
        return longitudEscalera;
    }
}
