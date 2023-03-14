package TA07;

import java.util.Hashtable;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class ControlStockApp {

	public static void main(String[] args) {
		Hashtable<String, double[]> productosInfo = new Hashtable<String, double[]>();

		crearListaProductos(productosInfo);

		int opcion;

		do {
			opcion = escogerOpcion();

			switch (opcion) {
			case 1: // Añadir
				añadirArticulo(productosInfo);
				break;
			case 2: // Modificar
				modificarArticulo(productosInfo);
				break;
			case 3: // Mostrar uno
				mostrarArticulo(productosInfo);
				break;
			case 4: // Listar todo
				listarTodo(productosInfo);
				break;
			}
		} while (opcion != 0);
	}

	public static int escogerOpcion() {
		String opcionS = JOptionPane.showInputDialog(null,
				"Introduce una opcion:\n" + "  1 Añadir articulo\n" + "  2 Modificar articulo\n"
						+ "  3 Mostrar articulo\n" + "  4 Listar todos los articulos\n" + "  0 Terminar programa");

		return Integer.parseInt(opcionS);
	}

	public static void crearListaProductos(Hashtable<String, double[]> productosInfo) {
		double aux1[] = { 2.24, 14 };
		productosInfo.put("Manzana", aux1);

		double aux2[] = { 12.56, 5 };
		productosInfo.put("Salmon", aux2);

		double aux3[] = { 1.38, 15 };
		productosInfo.put("Pan", aux3);

		double aux4[] = { 0.79, 30 };
		productosInfo.put("Tomate", aux4);

		double aux5[] = { 6.61, 52 };
		productosInfo.put("Huevos", aux5);

		double aux6[] = { 0.75, 41 };
		productosInfo.put("Agua", aux6);

		double aux7[] = { 3.72, 27 };
		productosInfo.put("Leche", aux7);

		double aux8[] = { 5.62, 36 };
		productosInfo.put("Platano", aux8);

		double aux9[] = { 3.84, 8 };
		productosInfo.put("Cereales", aux9);

		double aux10[] = { 1.98, 81 };
		productosInfo.put("Pañuelos", aux10);
	}

	public static void añadirArticulo(Hashtable<String, double[]> productosInfo) {
		String nombre = JOptionPane.showInputDialog(null, "Introduce nombre del articulo");

		String precioS = JOptionPane.showInputDialog(null, "Introduce precio del articulo");
		double precio = Double.parseDouble(precioS);

		String cantidadS = JOptionPane.showInputDialog(null, "Introduce cantidad del articulo");
		double cantidad = Double.parseDouble(cantidadS);

		double aux[] = { precio, cantidad };
		productosInfo.put(nombre, aux);
	}

	public static void modificarArticulo(Hashtable<String, double[]> productosInfo) {
		String nombre = JOptionPane.showInputDialog(null, "Introduce nombre del articulo");

		String precioS = JOptionPane.showInputDialog(null, "Introduce precio del articulo");
		double precio = Double.parseDouble(precioS);

		String cantidadS = JOptionPane.showInputDialog(null, "Introduce cantidad del articulo");
		double cantidad = Double.parseDouble(cantidadS);

		double aux[] = { precio, cantidad };
		productosInfo.replace(nombre, aux);
	}

	public static void mostrarArticulo(Hashtable<String, double[]> productosInfo) {
		String nombre = JOptionPane.showInputDialog(null, "Introduce nombre del articulo");

		System.out.println("Articulo: " + nombre + " / Precio: " + productosInfo.get(nombre)[0] + " - Cantidad: "
				+ productosInfo.get(nombre)[1] + "\n");
	}

	public static void listarTodo(Hashtable<String, double[]> productosInfo) {
		for (Entry<String, double[]> entry : productosInfo.entrySet()) {
			System.out.println("Articulo: " + entry.getKey() + " / Precio: " + entry.getValue()[0] + " - Cantidad: "
					+ entry.getValue()[1]);
		}
		System.out.println("");
	}
}
