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
public class D10porcentajeFinal {
    public static void main(String[] args) {
        float notasparOneyTwo,notasparOne,notaspartwo,parFinal,trabajoFin,notaFinal,notaspartre;
        int parcial1,parcial2,parcial3,parcialFinal,trabajo;
    
        Scanner lectura =new Scanner (System.in);
    
        System.out.println("cuanto saco en el primer parcial el estudiante  ?");
        parcial1=lectura.nextInt();
        System.out.println("cuanto saco en el segundo parcial parcial el estudiante  ?");
        parcial2=lectura.nextInt();
        System.out.println("cuanto saco en el tercer parcial el estudiante  ?");
        parcial3=lectura.nextInt();
        System.out.println("cuanto saco en el parcial final  ?");
        parcialFinal=lectura.nextInt();
        System.out.println("cuanto saco en el trabajo final el estudiante ?");
        trabajo=lectura.nextInt();
        
        notasparOne =(float)(parcial1*18.333/100);
        notaspartwo = (float)(parcial2*18.333/100);
        notaspartre = (float)(parcialFinal*18.333/100);
        notasparOneyTwo=(float)(notasparOne+notaspartwo+notaspartre);
        parFinal=(float)(parcial3*0.30);
        trabajoFin=(float)(trabajo*0.15);
        notaFinal= (float)(trabajoFin+parFinal+notasparOneyTwo);
        
        
        System.out.println("el estudiante obtuvo como nota final del curso ="+notaFinal);
    }
}
