package programacion_II;

import java.util.Scanner;

public class B07pago {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("A cuantas cuotas pagará el producto?: ");
        int cuotas = e.nextInt();
        System.out.print("Cual es la cuota inicial?: ");
        int cuota = e.nextInt();
        
        for (int i = 1; i < cuotas; i++){
            
            cuota += cuota;
            
            System.out.println(cuota);
            
        }
        
        System.out.println("Al final de los " + cuotas + " meses, usted pagará " + cuota + "€.");
        
    }
    
}