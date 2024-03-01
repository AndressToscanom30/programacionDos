package programacion_II;

import java.util.Scanner;
/**
 *
 * @author luiseduardoherrerasperandio
 */
public class D04operaciones {
    public static void main(String[] args) {
        int numero1,numero2;

        Scanner lectura =new Scanner(System.in);
        System.out.println("digite porfavor un numero ");
        numero1=lectura.nextInt();
        System.out.println("digite porfavor otro numero");
        numero2=lectura.nextInt();

        double division = (double) numero1 / (double) numero2;
        int suma= numero1+numero2;
        int multiplicacion= numero1*numero2;
        int resta=numero1-numero2;

        System.out.print("La division de los dos numeros es: "+division);
        System.out.println("\nla suma de los dos numeros es: "+suma);
        System.out.println("la multiplicacion de los dos numeros es="+multiplicacion);
        System.out.println("la resta de los dos numeros es="+resta);
    
    }

}