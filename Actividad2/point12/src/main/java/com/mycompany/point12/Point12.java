/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point12;

/**
 *
 * @author samue
 */
import java.util.Scanner;

public class Point12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee el nombre del dia
        System.out.print("Ingrese el nombre de un día de la semana: ");
        String dia = scanner.nextLine();

        // dia siguiente
        String diaSiguiente = DiaSiguiente.obtenerDiaSiguiente(dia);

        System.out.println("El día siguiente a " + dia + " es " + diaSiguiente);
    }
}
