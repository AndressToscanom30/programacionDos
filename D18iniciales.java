package programacion_II;

import java.util.Scanner;

public class D18iniciales {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Su nombre: ");
        String nombre = n.next();
        
        System.out.print("Primer apellido: ");
        String apellidoUno = n.next();
        System.out.print("Segundo apellido: ");
        String apellidoDos = n.next();
        
        String[] nombreI = nombre.split("");
        String[] apeUnoI = apellidoUno.split("");
        String[] apeDosI = apellidoDos.split("");
        
        System.out.println(nombreI[0].toUpperCase() + apeUnoI[0].toUpperCase() + apeDosI[0].toUpperCase());
        
        //System.out.println(nombre.substring(0, 1));   **Otra forma de hacer
        
    }
    
}
