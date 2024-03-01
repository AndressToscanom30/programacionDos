package programacion_II;

import java.util.Scanner;

public class D20euros {

    public static void main(String[] args) {
        
        Scanner m = new Scanner(System.in);
        
        System.out.print("Cantidad de monedas de 2 euros: ");
        int monedaDos = m.nextInt();
        
        System.out.print("Cantidad de monedas de 1 euro: ");
        int monedaUn = m.nextInt();
        
        System.out.print("Cantidad de monedas de 50 centimos: ");
        int monedaCin = m.nextInt();
        
        System.out.print("Cantidad de monedas de 20 centimos: ");
        int monedaVein = m.nextInt();
        
        System.out.print("Cantidad de monedas de 10 centimos: ");
        int monedaDie = m.nextInt();
        
        int eurosDeDos = monedaDos * 2;
        
        int eurosDeUn = monedaUn * 1;
        
        int centimosDeCin = monedaCin * 50;
        
        int centimosDeVein = monedaVein * 20;
        
        int centimosDeDie = monedaDie * 10;
        
        int eurosTotal = eurosDeDos + eurosDeUn;
        
        int centimosTotal = centimosDeCin + centimosDeVein + centimosDeDie;
        
        int totalEuros = eurosTotal + (centimosTotal / 100);
        
        int centimosRestantes = centimosTotal % 100;
        
        System.out.println("Total en euros: " + totalEuros + " con " + centimosRestantes + " centimos.");
        
    }
    
}
