/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point5;

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class Point5 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del circulo grande (R): ");
        double radioMayor = scanner.nextDouble();
        
        System.out.print("Ingrese el radio del circulo pequeño (r): ");
        double radioMenor = scanner.nextDouble();
        
        //área de la corona circular
        double areaCorona = AreaCirculo.calcularAreaCoronaCircular(radioMayor, radioMenor);

        System.out.println("El area de la corona circular es: " + areaCorona);

    }
}
