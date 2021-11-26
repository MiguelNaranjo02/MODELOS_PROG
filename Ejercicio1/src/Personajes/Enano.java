package Personajes;

/**
 * Clase Enano
 * 
 * Clase hija de Razas, contiene los atributos especificos para el tipo de personaje Enano.
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 18/11/2021
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Enano extends Razas {

	/**
	 * Constructor para la clase Enano, inicializa los atributos que puede tener el
	 * personaje de este tipo y guarda la informacion del personaje en los arreglos.
	 */

	public Enano() {

		/*
		 * Arreglo que contiene los colores de ojos que puede tener el personaje.
		 */

		colorOjos = new String[3];
		String[] colorOjos = { "Negros", "Cafes", "Miel" };
		Ojos = new ArrayList<String>(Arrays.asList(colorOjos));

		/*
		 * Arreglo que contiene los tonos de color del pelo que puede tener el
		 * personaje.
		 */

		colorCabello = new String[3];
		String[] colorCabello = { "Pelirrojo", "Rubio", "Negro" };
		Cabello = new ArrayList<String>(Arrays.asList(colorCabello));

		/*
		 * Arreglo que contiene los tonos de color de la piel que puede tener el
		 * personaje.
		 */

		colorPiel = new String[2];
		String[] colorPiel = { "Blanco", "TrigueÃ±o" };
		Piel = new ArrayList<String>(Arrays.asList(colorPiel));

		/*
		 * Arreglo que contiene las armas iniciales que puede portar el personaje.
		 */

		armas = new String[3];
		String[] armas = { "Hacha", "Mazo", "Espada de Uruk-hai" };
		arma = new ArrayList<String>(Arrays.asList(armas));

		/*
		 * descripcion completa del personaje.
		 */

		setDescripcion("Son mucho mas bajos que cualquier otra raza, exceptuando a los hobbits"
				+ " pese a ello son robustos, corpulentos y mas fuertes y recios que el resto de las "
				+ "razas. Todos tienen barba, tanto hombres como mujeres, y el cortarsela es la mayor "
				+ "vergüenza y ofensa que se les que les puede hacer, mereciendo el odio y rencor de"
				+ " toda su raza.\n" + "\n"
				+ "Son grandes conocedores de la mineria y orfebreria agobiados por la larga "
				+ "labor de la busqueda y extraccion de los minerales subterraneos. "
				+ "Poseen una gran longevidad, llegando algunos a vivir alrededor de los 600 años.");

		/*
		 * Rangos en los que se puede definir las caracteristicas del personaje de
		 * altura y edad.
		 */

		altura = new double[] { 1.20, 1.50 };
		edad = new int[] { 50, 600 };

		setRaza("Enano");

	}
}
