/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */

package Personajes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Personaje {

	public static void main(String Arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Seleccione un personaje:");
		System.out.println("1.Elfo");
		System.out.println("2.Enano");
		System.out.println("3.Humano");
		Impresion impr = new Impresion();

		private int opc;
		opc = Integer.parseInt(in.readLine());
		switch (opc) {
		case 1:
			Elfo elf = new Elfo();
			elf.Liskov(elf);
			impr.porConsola(elf);
			break;
		case 2:
			Enano enan = new Enano();
			enan.Liskov(enan);
			impr.porConsola(enan);
			break;
		case 3:
			Humano huma = new Humano();
			huma.Liskov(huma);
			impr.porConsola(huma);
			break;
		default:

		}

	}
}
