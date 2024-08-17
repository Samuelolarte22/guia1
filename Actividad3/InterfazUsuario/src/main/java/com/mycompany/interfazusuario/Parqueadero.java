/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfazusuario;

/**
 *
 * @author samue
 */
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos;

    public Parqueadero() {
        this.vehiculos = new ArrayList<>();
    }

    // registrar entrada
    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // para registrar salida
    public double registrarSalida(String placa) {
        Vehiculo vehiculo = null;
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                vehiculo = v;
                break;
            }
        }
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehiculo con placa " + placa + " no está en el parqueadero.");
        }

        LocalDateTime horaSalida = LocalDateTime.now();
        Duration duracion = Duration.between(vehiculo.getHoraEntrada(), horaSalida);
        long horas = duracion.toHours();
        if (duracion.toMinutes() % 60 > 0) {
            horas++;  // Fracciones de hora se cuentan como hora completa
        }

        double costo = calcularCosto(vehiculo, horas);
        vehiculos.remove(vehiculo);
        return costo;
    }

    // calcular costo
    private double calcularCosto(Vehiculo vehiculo, long horas) {
        double tarifa = 0;
        if (vehiculo instanceof Automovil) {
            tarifa = 5000; // hora automoviles
        } else if (vehiculo instanceof Motocicleta) {
            tarifa = 3000; // hora motocicletas
        } else if (vehiculo instanceof Camion) {
            tarifa = 10000; // hora camiones
        }
        return tarifa * horas;
    }

    // Método para consultar el estado del parqueadero
    public List<Vehiculo> consultarEstado() {
        return vehiculos;
    }
}

