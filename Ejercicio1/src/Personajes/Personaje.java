package Personajes;

/**
 * Clase Personaje
 * 
 * Clase de tipo main, muestra el menu de los personajes y llama a operar a las demas clases.
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 18/11/2021
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Personaje {

	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * Se imprime el menu, con los distintos personajes que el usuario puede elegir.
		 */

		System.out.println("Seleccione un personaje:");
		System.out.println("1.Elfo");
		System.out.println("2.Enano");
		System.out.println("3.Humano \n");

		/*
		 * Se instancian los objetos necesarios para la asignacion e impresion de los
		 * atributos del personaje elegido.
		 */

		Impresion impr = new Impresion();
		Razas planti = null;

		/*
		 * Se crea una variable para detectar el personaje elegido por el usuario.
		 */

		int opc = Integer.parseInt(in.readLine());
		System.out.println("\n");
		/*
		 * De acuerdo a la opcion elegida se le asigna un nuevo valor a la variable
		 * planti para entregar atributos del tipo de personaje seleccionado.
		 */

		switch (opc) {
		case 1:
			planti = new Elfo();
			break;
		case 2:
			planti = new Enano();
			break;
		case 3:
			planti = new Humano();
			break;
		default:

		}

		/*
		 * Se llama al metodo de asignacion de datos para el personaje personaje y al
		 * metodo de impresion de los datos por consola para la visualizacion por parte
		 * del usuario.
		 */

		planti.Liskov(planti);
		impr.porConsola(planti);
	}
}
