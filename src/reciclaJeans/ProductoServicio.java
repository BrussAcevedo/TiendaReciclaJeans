package reciclaJeans;

import java.util.ArrayList;

public class ProductoServicio {

	private ArrayList<Producto> listaProducto;

	public ProductoServicio(ArrayList<Producto> listaProducto) {
		super();
		this.listaProducto = listaProducto;
	}

	public ArrayList<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(ArrayList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	public void listarProductos() {

		if (!listaProducto.isEmpty()) {

			for (Producto producto : listaProducto) {
				mostrarDatosLista(producto);
				System.out.println("--------------------------------------------------------------");
			}

		} else {
			System.out.println("No Existen datos importados.");
			
		}

	}

	public void editarDatos() {	
		
		String codigoComparar = Integer.toString(Menu.atributoCompararMenu());
		
		int respuestaDos = 0;
		if (!listaProducto.isEmpty()) {
			for (Producto producto : listaProducto) {
System.out.println(producto.getCodigo());
				if (producto.getCodigo().equals(codigoComparar)) {
					respuestaDos = Menu.atributoCompararMenuDos(producto);
					if (respuestaDos > 0 && respuestaDos < 8) {
						editarSwitch(respuestaDos, producto);
						mostrarDatosLista(producto);
						System.out.println("Datos editados correctamente.");
						Utilidad.delay2000();
					

					}

				} else {
					System.out.println("No se encuentra el codigo.");
					
					break;
				}
			}
		} else {
			System.out.println("No existen datos.");
		}

	}
	

	public static void opcionAEditar() {

	}

	public static void mostrarDatosLista(Producto producto) {
		System.out.println("Datos del Producto");
		System.out.println("Nombre Articulo: " + producto.getArticulo());
		System.out.println("Código: " + producto.getCodigo());
		System.out.println("Marca: " + producto.getMarca());
		System.out.println("Color: " + producto.getColor());
		System.out.println("Descripcion: " + producto.getDescripcion());
		System.out.println("Precio: " + producto.getPrecio());
		System.out.println("Talla: " + producto.getTalla());
		System.out.println("");

	}

	public static void mostrarDatosListaNum(Producto producto) {
		System.out.println("Datos del Producto");
		System.out.println("1- Nombre Articulo: " + producto.getArticulo());
		System.out.println("2- Código: " + producto.getCodigo());
		System.out.println("3- Marca: " + producto.getMarca());
		System.out.println("4- Color: " + producto.getColor());
		System.out.println("5- Descripcion: " + producto.getDescripcion());
		System.out.println("6- Precio: " + producto.getPrecio());
		System.out.println("7- Talla: " + producto.getTalla());
		System.out.println("");

	}

	public static void editarSwitch(int respuestaDos, Producto producto) {
		String nuevoDato;

		switch (respuestaDos) {
		case 1: {
			nuevoDato = Menu.nuevoDatoEdit("Nombre Articulo");
			producto.setArticulo(nuevoDato);
			break;
		}
		case 2: {
			nuevoDato = Menu.nuevoDatoEdit("Codigo");
			producto.setCodigo(nuevoDato);
			break;		
		}
		case 3: {
			nuevoDato = Menu.nuevoDatoEdit("Marca");
			producto.setMarca(nuevoDato);
			break;
		}
		case 4: {
			nuevoDato = Menu.nuevoDatoEdit("Color");
			producto.setColor(nuevoDato);
			break;
		}
		case 5: {
			nuevoDato = Menu.nuevoDatoEdit("Descripcion");
			producto.setDescripcion(nuevoDato);
			break;
		}
		case 6: {
			nuevoDato = Menu.nuevoDatoEdit("Precio");
			producto.setPrecio(nuevoDato);
			break;
		}
		case 7: {
			nuevoDato = Menu.nuevoDatoEdit("Talla");
			producto.setTalla(nuevoDato);
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + respuestaDos);
		}
	}

}
