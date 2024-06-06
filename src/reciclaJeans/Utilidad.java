package reciclaJeans;

import java.time.Duration;
import java.time.Instant;

public class Utilidad {

	public static int validarEntero(String entrada, String regex) {
		int respuesta = 0;
		if (entrada.matches(regex)) {
			return respuesta = Integer.parseInt(entrada);
		}else {
			System.out.println("Formato no válido.");
			return respuesta = 0;
		}

		
	}
	
	
	public static void delay2000() {
	   
	        System.out.println("Porfavor espere un momento.");
	        Instant start = Instant.now();
	        try {
	            Thread.sleep(2000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        Instant end = Instant.now();
	        System.out.println(Duration.between(start, end).toMillis() + " milisegundos transcurridos...");
	
	}
	
}
