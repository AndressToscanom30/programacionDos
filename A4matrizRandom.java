package programacion_II;

import java.util.Random;

public class A4matrizRandom {
    public static void main(String[] args) {
        
        int[][] numeros = new int[4][5];
        
        Random random = new Random();
        
        System.out.println("Numeritos, numeritos...");
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 5; j++) {
                
                int numeroAl = random.nextInt(900) + 100;
                numeros[i][j] = numeroAl;
                
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