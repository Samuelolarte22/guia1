/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point4;

/**
 *
 * @author samue
 */

import java.util.Scanner;
public class Point4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();
        
        double gastoArriendo = GastoPedro.calcularGastoArriendo(sueldo);
        double gastoComida = GastoPedro.calcularGastoComida(sueldo);

        double dineroRestante = sueldo - (gastoArriendo + gastoComida);
        
        // Mostrar los resultados
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);

    }
}
