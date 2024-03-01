package programacion_II;

import java.util.Scanner;

public class B02comCero {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Cuantos número va a comparar?: ");
        int numeros = e.nextInt();
        
        int numeroComp, mayor = 0, menor = 0, igual = 0;
        
        for (int i = 0; i < numeros; i++){
            
            System.out.println("Ingrese un número: ");
            numeroComp = e.nextInt();
            
            if (numeroComp > 0){
                
                mayor++;
                
            }else if (numeroComp < 0){
                
                menor++;
                
            }
            else if (numeroComp == 0){
                
                igual++;
                
            }
            
        }
        
        System.out.println("Numeros introducidos:   " + numeros);
        System.out.println("Mayores a 0:            " + mayor);
        System.out.println("Menores a 0:            " + menor);
        System.out.println("Iguales a 0:            " + igual);
        
    }
    
}