package programacion_II;

import java.util.Scanner;

public class C08triangulos {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
     
        String tipo = "";
     
        System.out.println("Ingrese las distancias de los lados.");
        
        System.out.print("Lado 1: ");
        int ladoUno = e.nextInt();
        System.out.print("Lado 2: ");
        int ladoDos = e.nextInt();
        System.out.print("Lado 3: ");
        int ladoTres = e.nextInt();
        
        if (ladoUno == ladoDos && ladoUno != ladoTres){
            
            tipo = "isóceles";
            
        }
        else if (ladoUno == ladoDos && ladoUno == ladoTres){
            
            tipo = "equilatero";
            
        }
        else if (ladoUno != ladoDos && ladoUno != ladoTres){
            
            tipo = "escaleno";
            
        }
        
        System.out.println("El triangulo es " + tipo);
        
    }
    
}
