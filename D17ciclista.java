import java.util.Scanner;

public class D17ciclista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la hora de partida:");
        System.out.print("HH: ");
        int horaPartida = scanner.nextInt();
        System.out.print("MM: ");
        int minutoPartida = scanner.nextInt();
        System.out.print("SS: ");
        int segundoPartida = scanner.nextInt();

        System.out.print("Ingrese el tiempo de viaje en segundos (T): ");
        int tiempoViaje = scanner.nextInt();

        // Calcular la hora de llegada
        int segundosTotalesPartida = horaPartida * 3600 + minutoPartida * 60 + segundoPartida;
        int segundosTotalesLlegada = segundosTotalesPartida + tiempoViaje;
        
        int horaLlegada = segundosTotalesLlegada / 3600 % 24; // Obtener las horas de llegada (ajustar a formato de 24 horas)
        int minutoLlegada = (segundosTotalesLlegada % 3600) / 60; // Obtener los minutos de llegada
        int segundoLlegada = segundosTotalesLlegada % 60; // Obtener los segundos de llegada

        System.out.println("La hora de llegada a la ciudad B es: " + horaLlegada + " horas, " + minutoLlegada + " minutos, " + segundoLlegada + " segundos.");
    }
}
