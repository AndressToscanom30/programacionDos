package programacion_II;

import java.util.Scanner;

public class D02periArea {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        int base = e.nextInt();
        System.out.print("Ingrese la altura: ");
        int altura = e.nextInt();
        
        System.out.println("El perimetro es: " + (2 * altura + 2 * base));
        System.out.println("El área es: " + base * altura);
        
    }
    
}
