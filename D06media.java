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
public class D06media {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calcula la media de tres numeros");
        System.out.println("Ingresa el primer numero: ");
        float primer = sc.nextFloat();
        System.out.println("Ingresa el segundo numero: ");
        float segundo = sc.nextFloat();
        System.out.println("Ingresa el tercer numero: ");
        float tercer = sc.nextFloat();
        float media = (primer+segundo+tercer)/3;
        
        System.out.println("la media de tus tres numeros es: "+media);
    }
}
