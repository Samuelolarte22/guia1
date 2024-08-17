/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazusuario;

/**
 *
 * @author samue
 */
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class InterfazUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        while (true) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ingresar un vehiculo");
            System.out.println("2. Registrar salida de un vehiculo");
            System.out.println("3. Consultar estado del parqueadero");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de vehiculo:");
                    System.out.println("1. Automovil");
                    System.out.println("2. Motocicleta");
                    System.out.println("3. Camion");

                    int tipoVehiculo = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea

                    System.out.print("Ingrese la placa del vehiculo: ");
                    String placa = scanner.nextLine();

                    System.out.print("Ingrese la marca del vehiculo: ");
                    String marca = scanner.nextLine();

                    System.out.print("Ingrese el modelo del vehiculo: ");
                    String modelo = scanner.nextLine();

                    LocalDateTime horaEntrada = LocalDateTime.now();

                    switch (tipoVehiculo) {
                        case 1:
                            System.out.print("Ingrese el tipo de combustible: ");
                            String tipoCombustible = scanner.nextLine();
                            Automovil automovil = new Automovil(placa, marca, modelo, horaEntrada, tipoCombustible);
                            parqueadero.registrarEntrada(automovil);
                            break;
                        case 2:
                            System.out.print("Ingrese el Cilindraje: ");
                            int cilindraje = scanner.nextInt();
                            Motocicleta motocicleta = new Motocicleta(placa, marca, modelo, horaEntrada, cilindraje);
                            parqueadero.registrarEntrada(motocicleta);
                            break;
                        case 3:
                            System.out.print("Ingrese la capacidad de carga toneladas: ");
                            double capacidadCarga = scanner.nextDouble();
                            Camion camion = new Camion(placa, marca, modelo, horaEntrada, capacidadCarga);
                            parqueadero.registrarEntrada(camion);
                            break;
                    }
                    System.out.println("Vehiculo registrado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese la placa del vehiculo que sale: ");
                    String placaSalida = scanner.nextLine();
                    try {
                        double costo = parqueadero.registrarSalida(placaSalida);
                        System.out.println("El costo total es: $" + costo);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    List<Vehiculo> vehiculos = parqueadero.consultarEstado();
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehiculos en el parqueadero.");
                    } else {
                        for (Vehiculo v : vehiculos) {
                            System.out.println("Placa: " + v.getPlaca() + ", Marca: " + v.getMarca() + ", Modelo: " + v.getModelo() + ", Hora de Entrada: " + v.getHoraEntrada());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }
    }
}

