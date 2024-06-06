package reciclaJeans;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	
	
	public static int menuPrincipal() {
		Scanner scan = new Scanner(System.in);
		String respuestaStr;
	
		
		System.out.println("1 Listar Producto\r\n"
				+ "2 Editar Datos\r\n"
				+ "3 Importar Datos\r\n"
				+ "4 Salir\r\n"
				+ "Ingrese una opción:");
		
		respuestaStr = scan.nextLine();
		int respuesta = Utilidad.validarEntero(respuestaStr, "\\d+");

		return respuesta;
	}

	
	
	public static int atributoCompararMenu() {
		
		Scanner scan = new Scanner(System.in);
		String entradaStr;
		int respuesta =0;

		System.out.println("Ingrese el codigo del producto. (si no lo recuerda, escriba menu y visite la opcion 1: Listar Productos).");
		entradaStr = scan.nextLine();
		
		if (entradaStr.equalsIgnoreCase("menu")) {
			Menu.menuPrincipal();

		}else {
			
			int entrada = Utilidad.validarEntero(entradaStr, "\\d+"); 
				if(entrada > 0) {
					
					return entrada;
				}else {
					System.out.println("Codigo Invalido.");
					Menu.menuPrincipal();
				}
		}
		
		return respuesta;
	}
	
	
	
	public static int atributoCompararMenuDos(Producto producto) {
		Scanner scan = new Scanner(System.in);
		String respuestaStr;
		int respuesta;
		
		System.out.println("Datos del Producto Seleccionado: ");
		ProductoServicio.mostrarDatosListaNum(producto);
		System.out.println("Selecciona el Atributo a editar: (Ingresa un número)");
		respuestaStr = scan.nextLine();
		
		return respuesta = Utilidad.validarEntero(respuestaStr, "\\d+");
		
		
	}
	
	public static String nuevoDatoEdit(String atributo) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba el nuevo"+ atributo+": ");
		return scan.nextLine();
	
	}
	
	
}
