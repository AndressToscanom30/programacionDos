package programacion_II;

import java.util.Scanner;

public class B05numerosIntervalos {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        int min, max, numero, out = 0, iguales = 0, sumaTotal = 0;
        
        System.out.print("Digite el limite inferior: ");
        min = e.nextInt();
        
        do{
            
            System.out.print("Digite el limite superior: ");
            max = e.nextInt();
            
            if (min > max){
                
                System.out.println("El limite inferior debe ser menor que el limite superior.\n");
                
                
            }
            
        } while(min > max);
        
        System.out.println("\nPara terminar el programa ingrese 0.");

        System.out.print("Ingrese un número: ");
        numero = e.nextInt();

        while (numero != 0) {

            if (numero < min || numero > max) {

                out++;

            } 
            else if (numero == min || numero == max) {

                iguales++;
                
                sumaTotal += numero;

            } 
            else {

                sumaTotal += numero;

            }

            System.out.print("Ingrese un número: ");
            numero = e.nextInt();
        }
        
        System.out.println("\n----Resultados----");
        
        System.out.println("Suma de numeros entre los limites:   " + sumaTotal);
        System.out.println("Numero fuera de los limites:         " + out);
        System.out.println("Numero/s igual/es entre los limites: " + iguales);
        
    }
    
}