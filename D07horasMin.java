/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_II;

import java.util.Scanner;

/**
 *
 * @author LabSispc13
 */
public class D07horasMin {
        public static void main(String[] args) {
        System.out.println("minutos a convertir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos son equivalentes a " + horas + " horas y " + minutosRestantes + " minutos.");
    }
}
