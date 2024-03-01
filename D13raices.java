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
public class D13raices {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero para calcular su raiz cuadrada y cubica: ");
        Double num = sc.nextDouble();
        
        double cuadrada = (double)Math.sqrt(num);
        double cubica = (double)Math.cbrt(num);
        System.out.println("la raiz cuadrada es: "+cuadrada);
        System.out.println("la raiz cubica es: "+cubica);
        
    }
}
