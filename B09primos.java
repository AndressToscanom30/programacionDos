package programacion_II;

import java.util.Scanner;

public class B09primos {
    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        int primosEncontrados = 0;
        int numeroActual = 2;
        
        System.out.print("Ingrese la cantidad de números primos que desea ver: ");
        int limite = e.nextInt();

        while (primosEncontrados < limite){
            
            boolean esPrimo = true;
            
            for (int i = 2; i <= numeroActual / 2; i++){
                
                if (numeroActual % i == 0){
                    
                    esPrimo = false;
                    break;
                    
                }
                
            }
            
            if (esPrimo){
                
                System.out.println(numeroActual);
                primosEncontrados++;
                
            }
            
            numeroActual++;
        
        }
    }
    
}