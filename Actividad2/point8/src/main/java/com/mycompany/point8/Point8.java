/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point8;

/**
 *
 * @author samue
 */

import java.util.Scanner;
public class Point8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        //capacidad salon
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();
        
        // salones por piso
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();
        
        // Calcular numero de salones necesarios
        int numeroSalones = Edificio.calcularNumeroSalones(numeroEstudiantes, capacidadSalon);
        
        // Calcular numero de pisos necesarios
        int numeroPisos = Edificio.calcularNumeroPisos(numeroSalones, salonesPorPiso);

        System.out.println("Número de salones necesarios: " + numeroSalones);
        System.out.println("Número de pisos necesarios: " + numeroPisos);

    }
}
