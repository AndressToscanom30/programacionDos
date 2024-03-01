package programacion_II;

import java.util.Scanner;

public class B06potenciaSinMath {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Calculemos una potencia...");
        
        int potencia = 1;
        
        System.out.print("Digite la base: ");
        int base = e.nextInt();
        System.out.print("Digite un numero entero positivo para el exponenete: ");
        int exponente = e.nextInt();
        
        for (int i = 0; i < exponente; i++){
            
            potencia *= base;
            
        }
        
        System.out.println("Resultado: " + potencia);
        
    }
    
}
