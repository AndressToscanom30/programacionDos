package programacion_II;

import java.util.Scanner;

public class C03divison {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Vamos a hacer una división");
        
        System.out.print("Digite el dividendo: ");
        double dividendo = e.nextDouble();
        System.out.print("Digite el divisor: ");
        double divisor = e.nextDouble();
        
        if (divisor == 0){
            
            System.out.println("SYNTAX ERROR");
            
        }
        else{
            
            System.out.println("Resultado de " + dividendo + "/" + divisor + " = " + (dividendo/divisor));
            
        }
        
    }
    
}
