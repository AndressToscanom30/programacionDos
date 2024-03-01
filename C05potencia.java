package programacion_II;

import java.util.Scanner;

public class C05potencia {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite la base: ");
        int base = e.nextInt();
        System.out.print("Digite el exponenete: ");
        int exponente = e.nextInt();
        
        if (exponente > 0){
            
            System.out.println("Resultado = " + Math.pow(base, exponente));
            
        }
        else if (exponente == 0){
            
            System.out.println("El resultado es = 1");
            
        }
        else {
            
            double potenciaP = Math.pow(base, -exponente);
            
            System.out.println("El resultado es = 1 / " + potenciaP);
            
        }
        
    }
    
}
