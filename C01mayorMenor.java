package programacion_II;

import java.util.Scanner;

public class C01mayorMenor {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero1 = e.nextInt();
        
        System.out.print("Ingrese otro número: ");
        int numero2 = e.nextInt();
        
        if (numero1 > numero2){
            
            System.out.println("El primer numero (" + numero1 + "), es mayor al numero 2 (" + numero2 + ").");
            
        }
        else if (numero1 < numero2){
            
            System.out.println("El segundo número (" + numero2 + "), es mayor al numero 1 (" + numero1 + ").");
            
        }
        else if (numero1 == numero2){
            
            System.out.println("Los números son iguales.");
            
        }
        
    }
    
    
}
