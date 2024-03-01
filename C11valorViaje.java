/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_II;

import java.util.Scanner;

/**
 *
 * @author nicom
 */
public class C11valorViaje {
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        
        double costoPorAlumno;
        
        if (cantidadAlumnos >= 100) {
            costoPorAlumno = 65;
        } else if (cantidadAlumnos >= 50) {
            costoPorAlumno = 70;
        } else if (cantidadAlumnos >= 30) {
            costoPorAlumno = 95;
        } else {
            costoPorAlumno = 4000/cantidadAlumnos; 
        }
        
        double costoTotalAlumnos = cantidadAlumnos * costoPorAlumno;
        double costoTotalViaje = (cantidadAlumnos < 30) ? 4000 : costoTotalAlumnos;
        
        System.out.println("Costo por alumno: " + costoPorAlumno + " euros");
        System.out.println("Total a pagar por todos los alumnos: " + costoTotalAlumnos + " euros");
        System.out.println("Total a pagar a la compañía de viajes: " + costoTotalViaje + " euros");
        
    }
}
