/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point10;

/**
 *
 * @author samue
 */
public class Calculadora {
    public static double aplicarOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                // si dividen por 0
                if (num2 == 0) {
                    throw new ArithmeticException("División por cero no permitida.");
                }
                return (double) num1 / num2;
            case "%":
                return num1 % num2;
            case "**":
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
