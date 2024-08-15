/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point14;

/**
 *
 * @author samue
 */
public class Point14 {

    public static void main(String[] args) {
        String nombre1 = "Ana";
        int edad1 = 22;
        String nombre2 = "Luis";
        int edad2 = 25;
        String nombre3 = "Carlos";
        int edad3 = 20;

        // metodo estatico
        String hermanoMayor = HermanoMayor.obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

        System.out.println("El hermano mayor es: " + hermanoMayor);
    }
}
