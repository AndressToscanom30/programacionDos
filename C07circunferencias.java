package programacion_II;

import java.util.Scanner;

public class C07circunferencias {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        String tipo = "";
        
        System.out.println("Digite el punto central del primer circulo.");
        System.out.print("Coordenada en X: ");
        int xUno = e.nextInt();
        System.out.print("Coordenada en Y: ");
        int yUno = e.nextInt();
        System.out.println("Ingrese el radio de este primer circulo: ");
        int r1 = e.nextInt();
        
        System.out.println("Digite el punto central del segundo circulo.");
        System.out.print("Coordenada en X: ");
        int xDos = e.nextInt();
        System.out.print("Coordenada en Y: ");
        int yDos = e.nextInt();
        System.out.println("Ingrese el radio de este segundo circulo: ");
        int r2 = e.nextInt();
        
        double distancia = Math.sqrt(Math.pow((xDos - xUno), 2) + Math.pow((yDos - yUno), 2));
        
        if (distancia == 0){
            
            tipo = "concéntricos";
            
        }
        else if (distancia > (r1 + r2)){
            
            tipo = "exteriores";
            
        }
        else if (distancia > 0 && distancia < Math.abs(r1 - r2)){
            
            tipo = "interiores";
            
        }
        else if (distancia == (r1 + r2)){
            
            tipo = "tangentes exteriores";
            
        }
        else if (distancia == Math.abs(r1 - r2)){
            
            tipo = "tangentes interiores";
            
        }
        else if (distancia < (r1 + r2) && distancia > Math.abs(r1 - r2)){
            
            tipo = "secantes";
            
        }
        
        System.out.println("Los circulos son " + tipo);
        
    }
    
}
