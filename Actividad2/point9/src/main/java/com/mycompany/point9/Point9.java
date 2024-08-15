/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point9;

/**
 *
 * @author samue
 */

import java.util.Scanner;
public class Point9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
       //Encontrar el mayor de los dos numeros
        int mayor = Comparador.encontrarMayor(num1, num2);
        
        // Imprimir el mayor numero
        System.out.println("El mayor número es: " + mayor);

    }
}
