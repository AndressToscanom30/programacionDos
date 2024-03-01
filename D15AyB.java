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
public class D15AyB {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        double A = sc.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double B = sc.nextDouble();

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        double aux = A;
        A = B;
        B = aux;

        System.out.println("\nValores después del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
