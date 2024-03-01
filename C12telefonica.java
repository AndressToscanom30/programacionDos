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
public class C12telefonica {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();
        
        System.out.print("Ingrese el día de la semana (1 para domingo, 2 para lunes, ..., 7 para sábado): ");
        int diaSemana = scanner.nextInt();
        
        System.out.print("Ingrese el turno de la llamada (1 para mañana, 2 para tarde): ");
        int turnoLlamada = scanner.nextInt();
        
        double costoLlamada = calcularCostoLlamada(duracionLlamada);
        
        double impuesto = calcularImpuesto(diaSemana, turnoLlamada, costoLlamada);
        
        double totalPagar = costoLlamada + impuesto;
        
        System.out.println("Costo de la llamada: " + costoLlamada + " euros");
        System.out.println("Impuesto: " + impuesto + " euros");
        System.out.println("Total a pagar: " + totalPagar + " euros");
        
        scanner.close();
    }
    
    // Función para calcular el costo de la llamada
    public static double calcularCostoLlamada(int duracionLlamada) {
        double costo = 0;
        
        if (duracionLlamada <= 5) {
            costo = 1;
        } else if (duracionLlamada <= 8) {
            costo = 1 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            costo = 1 + 3 * 0.8 + (duracionLlamada - 8) * 0.7;
        } else {
            costo = 1 + 3 * 0.8 + 2 * 0.7 + (duracionLlamada - 10) * 0.5;
        }
        
        return costo;
    }
    
    // Función para calcular el impuesto
    public static double calcularImpuesto(int diaSemana, int turnoLlamada, double costoLlamada) {
        double impuesto = 0;
        
        if (diaSemana == 1) {
            impuesto = costoLlamada * 0.03; 
        } else {
            if (turnoLlamada == 1) {
                impuesto = costoLlamada * 0.15; 
            } else {
                impuesto = costoLlamada * 0.10; 
            }
        }
        
        return impuesto;
    
    }
}
