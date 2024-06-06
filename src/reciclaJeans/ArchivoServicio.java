package reciclaJeans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoServicio {

	
	public static ArrayList<Producto> leerDatos(String archivoLecturaDir) {
		
		File fl = new File (archivoLecturaDir);
		ArrayList<Producto> lista = new ArrayList<>();
		
		try (FileReader fr = new FileReader(fl);BufferedReader br = new BufferedReader(fr)){
			
			String linea;
			
			while((linea = br.readLine()) != null) {
				
				lista.add(parsearAProducto(linea));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return lista;
	}
	
	
	public static Producto parsearAProducto(String linea) {
		String[] parte = linea.split(",");
		String articulo = parte[0];
		String precio= parte[1];
		String descripcion = parte[2];
		String codigo = parte[3];
		String talla = parte[4];
		String marca = parte [5];
		String color = parte [6];
		
		Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
		
		return producto;
	}
}















