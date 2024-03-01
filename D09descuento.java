/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios1;
import java.util.Scanner;
/**
 * */

 
public class D09descuento {
    public static void main(String[] args) {
    float valorF,descuento;
    int compra;
     Scanner lectura=new Scanner(System.in);
     System.out.println("cuanto costo la compra?");
    compra=lectura.nextInt();
    
    descuento=(float)(compra*0.15);
    valorF=(float)(compra-descuento);
    
    System.out.println("su compra final es por  ="+valorF);
    
    
    
    
    }
    
}
