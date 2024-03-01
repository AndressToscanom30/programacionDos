package programacion_II;

import java.util.Scanner;

public class C10uvaS {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Cual es el precio de su uva?");
        
        System.out.print("Precio inicial base: ");
        double precio = e.nextDouble();
        
        System.out.print("Que tipo de uva es(A o B)?: ");
        String tipo = e.next();
        
        if (tipo.toLowerCase().equals("a") || tipo.toLowerCase().equals("b")){
            
            System.out.print("Que tamaño tiene la uva?: ");
            byte size = e.nextByte();

            if (tipo.toLowerCase().equals("a")){

                if (size == 1){

                    precio += 0.20;

                }
                else if(size == 2){

                    precio += 0.30;

                }

            }

            else if (tipo.toLowerCase().equals("b")){

                if (size == 1){

                    precio -= 0.30;

                }
                else if (size == 2){

                    precio -= 0.50;

                }

            }

            System.out.println("El precio final de su cargamento es: " + precio);
            
        }else{
            System.out.println("X Tipo inválido X");
        }
        
    }
    
}