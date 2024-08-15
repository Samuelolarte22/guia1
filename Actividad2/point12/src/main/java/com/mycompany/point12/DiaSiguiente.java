/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point12;

/**
 *
 * @author samue
 */
public class DiaSiguiente {
    public static String obtenerDiaSiguiente(String dia) {
        switch (dia.toLowerCase()) { // todo a minusculas para evitar errores
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
            case "miercoles": //miercoles con tilde y sin tilde
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
            case "sabado": //sabado con tilde y sin tilde
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "Día inválido"; // En caso de que el usuario ingrese un día no válido
        }
    }
}
