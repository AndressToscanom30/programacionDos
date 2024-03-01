package programacion_II;

import java.util.Scanner;

public class D19notaFinal {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        //boolean valorNegativo = false;
        
        System.out.print("Ingrese las preguntas correctas: ");
        int correctas = e.nextInt();
        
        System.out.print("Ingrese las preguntas incorrectas: ");
        int incorrectas = e.nextInt();
        
        System.out.print("Ingrese las no contestadas: ");
        int sinContestar = e.nextInt();
        
        
        
        int puntajeParcial = correctas * 5;
        
        int puntajeFinal = puntajeParcial - incorrectas;
        
        System.out.println("El puntaje final fue: " + puntajeFinal);
        
    }
    
}
