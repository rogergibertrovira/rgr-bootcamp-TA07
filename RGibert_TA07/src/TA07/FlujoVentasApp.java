package TA07;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FlujoVentasApp {

	public static void main(String[] args) {
		ArrayList<Double> listaCompra = new ArrayList<Double>();

		crearListaCompra(listaCompra);
		mostrarCompra(listaCompra);

	}

	public static void crearListaCompra(ArrayList<Double> lista) {
		String precioS;
		double precio;

		do {
			precioS = JOptionPane.showInputDialog(null, "Precio del articulo (0 para terminar)");
			precio = Double.parseDouble(precioS);

			if (precio != 0)
				lista.add(precio);
		} while (precio != 0);
	}

	public static void mostrarCompra(ArrayList<Double> listaCompra) {
		double precioLista = 0.0;

		for (Double precio : listaCompra) {
			precioLista += precio;
		}

		String ivaS = JOptionPane.showInputDialog(null, "Introduce el IVA aplicado");
		double iva = Double.parseDouble(ivaS) / 100;

		double precioIVA = precioLista + precioLista * iva;

		String cantidadS = JOptionPane.showInputDialog(null, "Precio de la compra: " + precioIVA + "\nCantidad pagada");
		double cantidad = Double.parseDouble(cantidadS);

		DecimalFormat formato = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null,
				"IVA aplicado: " + iva + "%\nPrecio total bruto: " + formato.format(precioLista)
						+ "\nPrecio total mas IVA: " + formato.format(precioIVA) + "\nNumero de articulos: "
						+ listaCompra.size() + "\nCantidad pagada: " + formato.format(cantidad)
						+ "\nCambio a devolver: " + formato.format(cantidad - precioIVA));
	}
}
