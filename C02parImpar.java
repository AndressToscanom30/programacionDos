package programacion_II;

import java.util.Scanner;

public class C02parImpar {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Ingrese un número para ver si es par o impar: ");
        int numero = e.nextInt();
        
        if (numero % 2 == 0){
            
            System.out.println("El número efectivamente es par.");
            
        }else{
            
            System.out.println("El número es impar.");
            
        }
        
    }
    
}
