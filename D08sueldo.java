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
public class D08sueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el sueldo base de tu empleado: ");
        double sueldo = sc.nextDouble();
        System.out.println("Ingresa la cantidad de ventas: ");
        int ventas = sc.nextInt();
        
        if (ventas>0){
            double nSueldo = ((sueldo*0.1)*ventas)+sueldo;
            System.out.println("el total de el sueldo es: "+nSueldo);
            
        }else{
            System.out.println("el sueldo total es:"+sueldo);
        }
        
    }
}
