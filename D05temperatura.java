/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package programacion_II;

import java.util.Scanner;

/**
 *
 * @author LabSispc13
 */
public class D05temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la temperatura en grados Fahrenheit: ");
        float Gf=sc.nextFloat();
        
        float Gc =(float) ((Gf-32)/1.8);
        
        System.out.println("La temperatura en grados celsius es: "+Gc);
        
    }
}
