package Personajes;

/**
 * Clase Elfo
 * 
 * Clase hija de Razas, contiene los atributos especificos para el tipo de personaje Elfo.
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 18/11/2021
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Elfo extends Razas {

	/**
	 * Constructor para la clase elfo, inicializa los atributos que puede tener el
	 * personaje de este tipo y guarda la informacion del personaje en los arreglos.
	 */

	public Elfo() {

		/*
		 * Arreglo que contiene los colores de ojos que puede tener el personaje.
		 */

		colorOjos = new String[3];
		String[] colorOjos = { "Azules", "Verdes", "Avellana" };
		Ojos = new ArrayList<String>(Arrays.asList(colorOjos));

		/*
		 * Arreglo que contiene los tonos de color del pelo que puede tener el
		 * personaje.
		 */

		colorCabello = new String[3];
		String[] colorCabello = { "Rubio", "Plateado", "Negro" };
		Cabello = new ArrayList<String>(Arrays.asList(colorCabello));

		/*
		 * Arreglo que contiene los tonos de color de la piel que puede tener el
		 * personaje.
		 */

		colorPiel = new String[2];
		String[] colorPiel = { "Blanco", "Palido" };
		Piel = new ArrayList<String>(Arrays.asList(colorPiel));

		/*
		 * Arreglo que contiene las armas iniciales que puede portar el personaje.
		 */

		armas = new String[3];
		String[] armas = { "Arco y Flechas", "Daga Elfica", "Espada de los Altos Elfos" };
		arma = new ArrayList<String>(Arrays.asList(armas));

		/*
		 * descripcion completa del personaje.
		 */

		setDescripcion("Los Elfos son seres inmortales que no envejecen como los mortales. "
				+ "A los 50 años de edad, los elfos alcanzan el aspecto final que tendran "
				+ "el resto de su existencia y su crecimiento o desarrollo fisico se detiene "
				+ "al alcanzar los 100. Su desarrollo es claramente mucho mas lento que el de los "
				+ "mortales. Por lo que a la edad de 50 años pueden aparentar el aspecto fisico "
				+ "de los hombres en su juventud. Sin embargo, mentalmente crecen mas rapido que los "
				+ "mortales, aprendiendo a andar y hablar con menos de 1 año.\n" + "\n"
				+ "Son mas presistentes en mente y espiritu que los hombres y los enanos y son tambien mas habiles que estos. "
				+ "Poseen una vision muy superior, se recuperan antes de las heridas y no sufren de vejez o enfermedades de ningun tipo.");

		/*
		 * Rangos en los que se puede definir las caracteristicas del
		 * personaje de altura y edad.
		 */

		altura = new double[] { 1.77, 1.85 };
		edad = new int[] { 50, 100 };

		setRaza("Elfo");

	}

}
