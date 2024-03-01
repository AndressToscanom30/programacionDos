/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;

/**
 *
 * @author luiseduardoherrerasperandio
 */ 
import java.util.Scanner;
public class D11distancia {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        
        double distancia = Math.abs(numero1 - numero2);

        
        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es: " + distancia);

    
}
}