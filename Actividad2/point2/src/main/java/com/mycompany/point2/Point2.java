/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point2;

/**
 *
 * @author samue
 */

import java.util.Scanner;

public class Point2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de sillas por bus: ");
        int sillasPorBus = scanner.nextInt();
        System.out.print("Ingrese el número de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();
        System.out.print("Ingrese el número de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();
        
        int busesNecesarios = Paseo.calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        
        // Imprimir
        System.out.println("Número de buses necesarios: " + busesNecesarios);
    }
}
