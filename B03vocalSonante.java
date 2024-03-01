package programacion_II;

import java.util.Scanner;

public class B03vocalSonante {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        String letra;
        String[] vocales = {"a", "e", "i", "o", "u"};
        
        System.out.println("Ingresa letras...");
        System.out.println("Ingresa un espacio para acabar el programa.");
        
        do{
            
            System.out.print("Letra: ");
            letra = e.nextLine().toLowerCase();
            
            boolean esVocal = false;
            
            for (int i = 0; i < vocales.length; i++){
                
                if (letra.equals(vocales[i])){
                    
                    esVocal = true;
                    break;
                    
                }
                
            }
            
            if (esVocal){
                
                System.out.println("Es vocal.\n");
                
            }
            else if (letra.equals(" ")){
                
                System.out.println("Fin del programa.");
                System.exit(0);
            
            }
            else{
                
                System.out.println("Es consonante.\n");
                
            }
            
        }while (!letra.equals(" "));
        
    }
    
}
