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
public class C13dado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el resultado obtenido al lanzar el dado de seis caras: ");
        int resultado = scanner.nextInt();

        if (resultado >= 1 && resultado <= 6) {
            String caraOpuesta = determinarCaraOpuesta(resultado);
            System.out.println("La cara opuesta al resultado " + resultado + " es: " + caraOpuesta);
        } else {
            System.out.println("ERROR: número incorrecto");
        }
        

    }
    public static String determinarCaraOpuesta(int resultado) {
        switch (resultado) {
            case 1:
                return "SEIS";
            case 2:
                return "CINCO";
            case 3:
                return "CUATRO";
            case 4:
                return "TRES";
            case 5:
                return "DOS";
            case 6:
                return "UNO";
            default:
                return ""; 
        }
    }
}
