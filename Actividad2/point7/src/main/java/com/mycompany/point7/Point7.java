/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point7;

/**
 *
 * @author samue
 */

import java.util.Scanner;
public class Point7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // primer punto
        System.out.print("Ingrese la coordenada x1: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Ingrese la coordenada y1: ");
        double y1 = scanner.nextDouble();
        
        //segundo punto
        System.out.print("Ingrese la coordenada x2: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Ingrese la coordenada y2: ");
        double y2 = scanner.nextDouble();
        
        //distancia entre los dos puntos
        double distancia = Coordenadas.calcularDistancia(x1, y1, x2, y2);
        
        // pendiente de la recta entre los dos puntos
        double pendiente = Coordenadas.calcularPendiente(x1, y1, x2, y2);
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        System.out.println("La pendiente de la recta entre los dos puntos es: " + pendiente);

    }
}
