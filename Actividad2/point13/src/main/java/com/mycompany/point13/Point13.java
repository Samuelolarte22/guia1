/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point13;

/**
 *
 * @author samue
 */

import java.util.Scanner;
public class Point13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el sueldo actual del empleado
        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        // Llamar a la función calcularAumento desde la clase CalculoAumento
        double aumento = CalculoAumento.calcularAumento(sueldoActual);

        // Calcular el nuevo sueldo
        double nuevoSueldo = sueldoActual + aumento;

        // Imprimir el resultado
        System.out.println("El aumento es: $" + aumento);
        System.out.println("El nuevo sueldo es: $" + nuevoSueldo);
    }
}
