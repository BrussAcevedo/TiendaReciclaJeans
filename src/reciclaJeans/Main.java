package reciclaJeans;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean estado = false;
		ArrayList<Producto> raiz = new ArrayList<>();
		
		
		do {
			int respuestaMenu = Menu.menuPrincipal();
			
			
			switch (respuestaMenu) {
			case 1: {// Listar Producto
				ProductoServicio listar = new ProductoServicio(raiz);
				listar.listarProductos();
				break;
			}
			case 2: {// Editar Productos
				ProductoServicio listar = new ProductoServicio(raiz);
				listar.editarDatos();
				break;
			}
			case 3: {//Importar Producots
				
				raiz = ArchivoServicio.leerDatos("src/archivosImport/productosImportados.csv");
				ProductoServicio listar = new ProductoServicio(raiz);
				listar.listarProductos();
				break;
			}
			case 4: {//Salir
				Scanner scan = new Scanner(System.in);
				System.out.println("Cerrando el programa...");
				Utilidad.delay2000();
				
				System.out.println("Programa Finalizado");
				scan.close();
				estado = true;
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + respuestaMenu);
			}
			
			
			
		} while (!estado);
		
	
	}

}
