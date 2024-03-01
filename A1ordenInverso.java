package programacion_II;

import java.util.Scanner;

public class A1ordenInverso {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        int[] inverso = new int[10];
        
        System.out.println("Ingrese unos numeritos...");
        
        for (int i = 0; i < 10; i++){
            
            System.out.print("Numero " + (i + 1) + ": ");
            inverso[i] = e.nextInt();
            
        }
        
        System.out.println("\nNumeros en orden de ingreso: ");
        
        for (int i = 0; i < 10; i++){
            
            System.out.print("[" + inverso[i] + "] ");
                    
        }
        
        System.out.println("\nNumeros en el orden inverso: ");
        
        for (int i = inverso.length - 1; i >= 0; i--){
            
            System.out.print("[" + inverso[i] + "] ");
                    
        }
        
    }
    
}