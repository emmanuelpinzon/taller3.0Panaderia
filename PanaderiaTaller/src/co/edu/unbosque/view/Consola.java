package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Consola {
	private Scanner sc;

	public Consola() {
		sc = new Scanner(System.in);
	}

	public int readInt() {
		return sc.nextInt();
	}

	public float readFloat() {
		return sc.nextFloat();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public String readLine() {
		return sc.nextLine();
	}

	public double readDouble() {
		return sc.nextDouble();
	}

	public String readWrod() {
		return sc.nextLine();
	}

	public boolean readBoolean(String entrada) {
		if (entrada.toLowerCase().contains("si")) {
			return true;
		}else if (entrada.toLowerCase().contains("si")){
			return false;
		}
return false;
	}
	//		} else if (lectura.toLowerCase().equals("no")) {
	//return false;
//}
//return false;

	public void burnLine() {
		sc.nextLine();
	}

	public void printLine(String texto) {
		System.out.println(texto);
	}

	public void print(String text) {
		System.out.print(text);
	}

	public void mostrarMensajeEmergente(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarAlerta(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Alerta", JOptionPane.WARNING_MESSAGE);
	}

	public void mostrarError(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void mostrarListado(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Lista productos registrados", JOptionPane.INFORMATION_MESSAGE);
	}

	public String leerInputEliminar(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Eliminando producto", JOptionPane.WARNING_MESSAGE);
	}

	public String leerEntradaEmergente(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Ingresando dato", JOptionPane.WARNING_MESSAGE);
	}
}
