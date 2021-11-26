package Personajes;

/**
 * Clase Humano
 * 
 * Clase hija de Razas, contiene los atributos especificos para el tipo de personaje Humano.
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 18/11/2021
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Humano extends Razas {

	/**
	 * Constructor para la clase Humano, inicializa los atributos que puede tener el
	 * personaje de este tipo y guarda la informacion del personaje en los arreglos.
	 */

	public Humano() {

		/*
		 * Arreglo que contiene los colores de ojos que puede tener el personaje.
		 */

		colorOjos = new String[4];
		String[] colorOjos = { "Negros", "Cafes", "Azules", "Verdes" };
		Ojos = new ArrayList<String>(Arrays.asList(colorOjos));

		/*
		 * Arreglo que contiene los tonos de color del pelo que puede tener el
		 * personaje.
		 */

		colorCabello = new String[2];
		String[] colorCabello = { "Castaño", "Negro" };
		Cabello = new ArrayList<String>(Arrays.asList(colorCabello));

		/*
		 * Arreglo que contiene los tonos de color de la piel que puede tener el
		 * personaje.
		 */

		colorPiel = new String[3];
		String[] colorPiel = { "Blanco", "Trigueño", "Moreno" };
		Piel = new ArrayList<String>(Arrays.asList(colorPiel));

		/*
		 * Arreglo que contiene las armas iniciales que puede portar el personaje.
		 */

		armas = new String[3];
		String[] armas = { "Espada de los Hombres", "Espada y Escudo", "Arco y Flechas" };
		arma = new ArrayList<String>(Arrays.asList(armas));

		/*
		 * descripcion completa del personaje.
		 */

		setDescripcion("Poco se dice de los hombres en los relatos de las eras Antiguas, se sabe "
				+ "que despertaron en Hildarien, en las regiones mas orientales de la Tierra Media"
				+ " durante la Primera Edad del Sol. Los hombres llegaron a Beleriand, avanzada la"
				+ " Primera Edad, sus vidas eran cortas ya que morian pronto, pero a diferencia de"
				+ " los elfos su natalidad era muchisimo mayor.\n" + "\n"
				+ "Los hombres de la Primera Edad no crearon grandes ciudades, ni grandes ni"
				+ " peque�as, eran eminentemente rurales. A medida que llegaban se establecieron en"
				+ " Estolad, en el este, pero luego migraron a sus destinos definitivos, sin embargo"
				+ " siempre hubo hombres en esta region, sobretodo en la zona oriental, no de una"
				+ " casa definida, eran una mezcolanza de las tres. Antes de la Dagor Bragollach "
				+ "(Batalla de la Llama Sabita) habria unos 25.000 habitantes distribuidos por la" + " region.\n" + "\n"
				+ "Hay distincion entre los hombres propiamente dichos y otros seres humanoides "
				+ "como los hobbits (que probablemente fueran hombres en sus origenes) y los magos"
				+ " que por su apariencia se pensaba que eran hombres.");

		/*
		 * Rangos en los que se puede definir las caracteristicas del personaje de
		 * altura y edad.
		 */

		altura = new double[] { 1.60, 1.90 };
		edad = new int[] { 20, 70 };

		setRaza("Humano");

	}

}
