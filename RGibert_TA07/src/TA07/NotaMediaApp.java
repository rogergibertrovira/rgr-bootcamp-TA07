package TA07;

import java.util.Hashtable;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class NotaMediaApp {
	final static int NUMERO_NOTAS = 5;

	public static void main(String[] args) {
		Hashtable<String, Double> mediaAlumnos = new Hashtable<String, Double>();

		inserirTodosAlumnos(mediaAlumnos);
		mostrarAlumnos(mediaAlumnos);

	}

	public static void inserirTodosAlumnos(Hashtable<String, Double> medAlumnos) {
		String nAlumnosS = JOptionPane.showInputDialog(null, "Introduce el numero de alumnos");
		int nAlumnos = Integer.parseInt(nAlumnosS);

		for (int i = 0; i < nAlumnos; i++) {
			inserirAlumno(medAlumnos);
		}
	}

	public static void inserirAlumno(Hashtable<String, Double> medAlumnos) {
		String nombreAlumno = JOptionPane.showInputDialog(null, "Introduce el nombre del alumno");
		double notaMedia = 0.0;

		for (int i = 0; i < NUMERO_NOTAS; i++) {
			String notaS = JOptionPane.showInputDialog(null, "Introduce una nota");
			double nota = Double.parseDouble(notaS);

			notaMedia += nota;
		}

		notaMedia = notaMedia / NUMERO_NOTAS;
		medAlumnos.put(nombreAlumno, notaMedia);
	}

	public static void mostrarAlumnos(Hashtable<String, Double> medAlumnos) {
		for (Entry<String, Double> entry : medAlumnos.entrySet()) {
			System.out.println("Alumno: " + entry.getKey() + " / Nota media: " + entry.getValue());
		}
	}
}
