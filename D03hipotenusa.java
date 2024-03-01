/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios1;

/**
 *
 * @author luiseduardoherrerasperandio
 */
 
import java.util.Scanner ;
public class D03hipotenusa {

    public static void main(String[] args) {
        System.out.println("__-programa para sacar la hipoenusa de un triangulo rectangulo-__");
        
        float hipotenusa;
        int catetoA,catetoO,ladoA,ladoB;
        
        Scanner lectura= new Scanner(System.in);
        System.out.println("digite porfavor de el primer cuadrado del triangulo");
        ladoA=lectura.nextInt();
         System.out.println("digite porfavor el segundo cuadrado del triangulo rectangulo");
        ladoB=lectura.nextInt();
        
        hipotenusa= (float) Math. sqrt((ladoB*ladoB)+(ladoA*ladoA));
        
        
        System.out.println("la hipotenusa es ="+hipotenusa);
        
    }
}
