/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point6;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Point6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();
        
        // area del rectángulo
        double areaRectangulo = Terreno.areaRectangulo(B, C);
        
        // area del triángulo
        double areaTriangulo = Terreno.areaTriangulo(B, A - C);
        
        //area total del terreno
        double areaTotalTerreno = areaRectangulo + areaTriangulo;
        
        // perimetro del terreno
        double perimetroTerreno = Terreno.calcularPerimetroTerreno(A, B, C);

        System.out.println("El área total del terreno es: " + areaTotalTerreno);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);
    }
}
