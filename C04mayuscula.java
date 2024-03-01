package programacion_II;

import java.util.Scanner;

public class C04mayuscula {

    public static void main(String[] args) {
        
        int counter = 0;
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String texto = e.nextLine();
        
        for (int i = 0; i < texto.length(); i++){
            
            char letra = texto.charAt(i);
            
            if (Character.isUpperCase(letra)){
                
                counter++;
                
            }
            
        }
        
        System.out.println("Hay " + counter + " letras mayúsculas.");
        
    }
    
}
