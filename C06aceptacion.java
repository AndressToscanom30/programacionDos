package programacion_II;

import java.util.Scanner;

public class C06aceptacion {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite M si es hombre o F si es mujer: ");
        String sexo = e.next();
        
        if (sexo.toLowerCase().equals("m") || sexo.toLowerCase().equals("f")){
            
            System.out.print("Digite su edad: ");
            byte edad = e.nextByte();
            System.out.println("Cual fue su nota? (1-5): ");
            byte nota = e.nextByte();
            
            if (nota == 5 && edad > 18 && sexo.toLowerCase().equals("m")){
            
                System.out.println("Usted es un posible candidato.");

            }
            else if (nota == 5 && edad > 18 && sexo.toLowerCase().equals("f")){

                System.out.println("¡Usted ha sido aceptada!");

            }
            else{

                System.out.println("X Usted no ha sido aceptado/a X");

            }
            
        }
        else{
            
            System.out.println("Sexo no válido");
            
        }
        
    }
    
}