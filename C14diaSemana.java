package programacion_II;

import java.util.Scanner;
public class C14diaSemana {

    public static void main(String[] args) {
       
        Scanner i = new Scanner(System.in);

        System.out.print("Por favor ingrese un numero del 1 al 7: ");
        int numeroDia = i.nextInt();

        String diaSemana = diaSemana(numeroDia);

        if (diaSemana != null) {
            System.out.println("El dia correspondiente al numero ingresado " + numeroDia + " es: " + diaSemana + ".");
        } else {
            System.out.println("Error: Por favor ingrese un número del 1 al 7.");
        }
    }

    public static String diaSemana(int numeroDia) {
        switch (numeroDia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return null; 
        }
  
    }
    
}