package programacion_II;

import java.util.Scanner;

public class A3filasColumnas {
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        int[][] numeros = new int[4][5];
        
        System.out.println("Ingrese 20 números enteros:");
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 5; j++) {
                
                System.out.print("Ingrese el número en la posición [" + i + "][" + j + "]: ");
                
                numeros[i][j] = e.nextInt();
                
            }
            
        }
        
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];

        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 5; j++) {
                
                sumaFilas[i] += numeros[i][j];
                
                sumaColumnas[j] += numeros[i][j];
                
            }
            
        }
        
        int sumaTotal = 0;
        
        for (int i = 0; i < 4; i++) {
            
            sumaTotal += sumaFilas[i];
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 5; j++) {
                
                System.out.print("[" + numeros[i][j] + "] ");
                
            }
            
            System.out.println("| " + sumaFilas[i]);
        
        }
        
        for (int j = 0; j < 5; j++) {
            
            System.out.print(sumaColumnas[j] + "  ");
            
        }
        
        System.out.println("  " + sumaTotal);
        
    }
    
}