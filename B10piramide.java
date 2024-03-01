package programacion_II;

import java.util.Scanner;

public class B10piramide {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        int counter = 0;
        
         System.out.print("Ingrese el número de filas para la pirámide: ");
            int filas = e.nextInt();

            for (int i = 1; i <= filas; i++) {
                
                for (int j = 1; j <= filas - i; j++) {
                    System.out.print("   ");
                
                }
                
                for (int k = 1; k <= i; k++) {
                
                    System.out.print(" " + k + " ");
                
                }
                
                for (int k = i - 1; k >= 1; k--) {
                    
                    System.out.print(" " + k + " ");
                
                }
                
                System.out.println();
                
            }
        
    }
    
}