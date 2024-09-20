package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	private static Scanner sc;
	private static PrintWriter pw;
	private static File archivo;
	private static final String FOLDER_NAME = "data";

	public static void checkFolder() {
		archivo = new File(FOLDER_NAME);
		if (archivo.exists() & archivo.isDirectory()) {
			return;
		} else {
			archivo.mkdir();
		}
	}

	public static void writeFile(String url, String content) {
		try {
			archivo = new File(FOLDER_NAME + "/" + url);// no se pueden crear archivos en carpetas protegidas. url
														// absolutas y relativas
			if (!archivo.exists()) {

				archivo.createNewFile();
			}
			pw = new PrintWriter(archivo);
			pw.write(content);
			pw.close();

		} catch (FileNotFoundException e) {

			System.out.println("error en la escritura del archivo");
			// e.printStackTrace();
		} catch (IOException e) {

			System.out.println("error en la creacion del archivo(texto plano)");
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

	}

}
