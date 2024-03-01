package programacion_II;

import java.util.Scanner;

public class C09year {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Ingrese el año: ");
        int year = e.nextInt();
        
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            
            System.out.println("El año es bisiesto.");
            
        }
        else{
            
            System.out.println("El año no es bisiesto.");
            
        }
        
    }
    
}
