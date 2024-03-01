package programacion_II;

import java.util.Scanner;
        
public class B04pares {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroUno = e.nextInt();
        System.out.print("Ingrese otro numero que sea mayor que el anterior: ");
        int numeroDos = e.nextInt();

        for (int i = numeroUno; i <= numeroDos; i++){

            if (i % 2 == 0){

              System.out.println(i);

            }

        }

    }

}