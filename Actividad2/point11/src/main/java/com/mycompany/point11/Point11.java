/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point11;

/**
 *
 * @author samue
 */

import java.util.Scanner;
public class Point11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el input
        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();
        
        // Verificar exception
        if (numero < 1 || numero > 99) {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        } else {
            // decenas y unidades
            int decenas = NumeroRomano.obtenerDecenas(numero);
            int unidades = NumeroRomano.obtenerUnidades(numero);
            
            // Convertir a romano
            String romanoDecenas = NumeroRomano.convertirDecenaARomano(decenas);
            String romanoUnidades = NumeroRomano.convertirUnidadARomano(unidades);
            
            // Imprimir el resultado en romano
            System.out.println("El número " + numero + " en romano es: " + romanoDecenas + romanoUnidades);
        }
        
    }
}
