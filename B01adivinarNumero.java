package programacion_II;

import java.util.Random;
import java.util.Scanner;

public class B01adivinarNumero {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        Random b = new Random();
        
        byte numeroR = (byte)b.nextInt(100);
        boolean encontrado = false;
        byte intento = 10, intentoJ = 0;
        int score = 1000;
        
        System.out.println("Adivina un número del 1 al 100.");
        
        do{
            
            intentoJ +=1;
            System.out.println("Intentos restantes " + intento);
            System.out.print("Ingrese el numero: ");
            byte numero = a.nextByte();
            
            if (numero == numeroR){
                
                System.out.println("\n------------- Scoreboard -------------");
                System.out.println("               YOU WIN");
                System.out.println("Numero a adivinar: " + numeroR);
                System.out.println("Score:             " + score);
                System.out.println("Intentos:          " + intentoJ);
                System.out.println("--------------------------------------");
                
                encontrado = true;
                
            }
            else{
                
                score -= 100;
                intento -= 1;
                
                if(intento == 0){
                    
                    System.out.println("\n------------- Scoreboard -------------");
                    System.out.println("               YOU LOSE");
                    System.out.println("Numero a adivinar: " + numeroR);
                    System.out.println("Score:             " + score);
                    System.out.println("Intentos:          " + intentoJ);
                    System.out.println("--------------------------------------");
                    System.exit(0);
                    
                }
                if (numero < numeroR){
                    
                    System.out.println("El numero a encontrar es mayor.");
                    
                }
                else if (numero > numeroR){
                    
                    System.out.println("El numero a encontrar es menor.");
                    
                }
                
            }
            
        }while(encontrado == false);
        
    }
    
}