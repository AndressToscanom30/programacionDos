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
public class D14invertido {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero de dos cifras:");
        int num = sc.nextInt();
        int inv = (num%10)*10+(num/10);   
        System.out.println("el numero invertido es: "+inv);
    }
}
