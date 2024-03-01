package programacion_II;

import java.util.Scanner;

public class A2minMax {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Ingrese unos numeritos...");
        
        for (int i = 0; i < 10; i++){
            
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = e.nextInt();
            
        }
        
        int max = numeros[0];
        int min = numeros[0];
        
        for (int i = 1; i < 10; i++){
            
            if (numeros[i] > max){
                
                max = numeros[i];
                
            }
            if(numeros[i] < min){
                
                min = numeros[i];
                
            }
            
        }
        
        System.out.println("\nNumeros: ");
        
        for (int i = 0; i < 10; i++){
            
            if (numeros[i] == max){
                
                System.out.print("[" + numeros[i] + "] <- Máximo ");
                
            }
            else if (numeros[i] == min){
                
                System.out.print("[" + numeros[i] + "] <- Mínimo ");
                
            }
            else{
                
                System.out.print("[" + numeros[i] + "] ");
                
            }
            
            System.out.println();
                    
        }
        
    }
    
}