/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_II;

import java.util.Scanner;

/**
 *
 * @author nicom
 */
public class C16costoPaquete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del paquete en kilogramos:");
        double peso = scanner.nextDouble();

        if (peso <= 5) {
            System.out.println("Ingrese la zona de destino (1: América del Norte, 2: América Central, 3: América del Sur, 4: Europa, 5: Asia):");
            int zona = scanner.nextInt();

            double costoPorKg = obtenerCostoPorKilogramo(zona);
            if (costoPorKg != -1) {
                double costoTotal = peso * costoPorKg;
                System.out.println("El costo de envío es: " + costoTotal + " euros.");
            } else {
                System.out.println("Zona de destino no válida.");
            }
        } else {
            System.out.println("Lo sentimos, no podemos enviar paquetes con un peso superior a 5kg.");
        }

        scanner.close();
    }

    public static double obtenerCostoPorKilogramo(int zona) {
        switch (zona) {
            case 1:
                return 24.00;
            case 2:
                return 20.00;
            case 3:
                return 21.00;
            case 4:
                return 10.00;
            case 5:
                return 18.00;
            default:
                return -1; // Retorna -1 si la zona no es válida
        }
    }
}
