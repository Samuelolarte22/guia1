/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point8;

/**
 *
 * @author samue
 */
public class Edificio {
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        //Calcula numero de pisos
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }
}
