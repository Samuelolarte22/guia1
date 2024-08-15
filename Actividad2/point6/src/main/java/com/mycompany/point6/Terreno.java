/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point6;

/**
 *
 * @author samue
 */
public class Terreno {
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // hipotenusa de un triangulo rectángulo a partir de los catetos
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // area de un triangulo a partir de su base y altura
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    //el perimetro del terreno
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoB, ladoA - ladoC);
        return ladoA + ladoB + ladoC + hipotenusa;
    }
}
