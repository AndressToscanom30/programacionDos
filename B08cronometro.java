package programacion_II;

public class B08cronometro {

    public static void main(String[] args) {
        
        int minutos = 0, segundos = 0, horas = 0;
        
        for (horas = 0; horas <60; horas++){
            
            for (minutos = 0; minutos < 60; minutos ++){
            
                for (segundos = 0; segundos < 60; segundos++){

                    String tiempoFormateado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
                    
                    System.out.println(tiempoFormateado);
                    retrasoSegundo();

                }
            
            }
            
        }
        
        
        
    }
    
    private static void retrasoSegundo(){
        
        try{
            
            Thread.sleep(1000);
            
        }catch(InterruptedException e){}
        
    }
    
}