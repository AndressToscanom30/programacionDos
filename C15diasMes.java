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
public class C15diasMes {
    public static void main (String [] args){
        
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero entre 1 y 12:");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            int dias = obtenerDiasDelMes(mes);
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes no válido. Debe estar entre 1 y 12.");
        }

    }

    public static int obtenerDiasDelMes(int mes) {
        switch (mes) {
            case 2:
                return 28; 
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
