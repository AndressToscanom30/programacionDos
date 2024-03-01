package programacion_II;

import java.util.Scanner;

public class D01saludo {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite su nombre: ");
        String nombre = e.nextLine();
        
        System.out.println("Hola " + nombre);
        
    }
    
}