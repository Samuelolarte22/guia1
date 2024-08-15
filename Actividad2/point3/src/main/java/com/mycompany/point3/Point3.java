/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point3;

/**
 *
 * @author samue
 */

import java.util.Scanner;

public class Point3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la escalera (x) en cm: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Ingrese el ángulo de inclinación (α) en grados: ");
        double angulo = scanner.nextDouble();
        
        // Calcular la longitud de la escalera
        double longitudEscalera = Escalera.calcularLongitudEscalera(altura, angulo);

        System.out.println("La longitud de la escalera (y) es: " + longitudEscalera);
    }
}
