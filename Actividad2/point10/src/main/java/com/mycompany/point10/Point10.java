/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point10;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Point10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el primer numero
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        // Leer el segundo numero
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        // Leer el operador
        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();
        
        try {
            // operacion
            double resultado = Calculadora.aplicarOperacion(num1, num2, operador);
            
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (Exception e) {
            // excepcion 
            System.out.println("Error: " + e.getMessage());
        }
    }
}
