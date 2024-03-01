package programacion_II;

import java.util.Scanner;
/**
 *
 * @author nicom
 */
public class D16alcanzar {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese la distancia entre los dos vehículos (en kilómetros): ");
        double distancia = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehículo que está atrás (en km/h): ");
        double velocidadAtras = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehículo que está adelante (en km/h): ");
        double velocidadAdelante = sc.nextDouble();

        double tiempo = distancia / (velocidadAdelante - velocidadAtras);
        tiempo *= 60;
        
        System.out.println("El vehículo más rápido alcanzará al otro en aproximadamente " + (tiempo < 0 ? (tiempo * -1) : tiempo ) + " minutos.");

    }
}
