/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */

package Personajes;

import java.util.ArrayList;
import java.util.Arrays;

//Raza enano que hereda de plantilla
public class Enano extends Plantilla {

	// Constructor que inicializa y guarda la informacion especifica del Enano en
	// los arreglos
	public Enano() {
		colorOjos = new String[3];
		String[] colorOjos = { "Negros", "Cafes", "Miel" };
		Ojos = new ArrayList<String>(Arrays.asList(colorOjos));

		colorCabello = new String[3];
		String[] colorCabello = { "Pelirrojo", "Rubio", "Negro" };
		Cabello = new ArrayList<String>(Arrays.asList(colorCabello));

		colorPiel = new String[2];
		String[] colorPiel = { "Blanco", "TrigueÃ±o" };
		Piel = new ArrayList<String>(Arrays.asList(colorPiel));

		armas = new String[3];
		String[] armas = { "Hacha", "Mazo", "Espada de Uruk-hai" };
		arma = new ArrayList<String>(Arrays.asList(armas));
		descripcion = "Son más bajos que cualquier otra raza, exceptuando a los hobbits"
				+ " pese a ello son robustos, corpulentos y más fuertes y recios que el resto de las "
				+ "razas. Todos tienen barba, tanto hombres como mujeres, y el cortarsela es la mayor "
				+ "vergÜenza y ofensa que se les que les puede hacer, mereciendo el odio y rencor de"
				+ " toda su raza.\n" + "\n"
				+ "Son grandes conocedores de la minería y orfebrería agobiados por la larga "
				+ "labor de la busqueda y extracción de los minerales subterraneos. "
				+ "Poseen una gran longevidad, llegando algunos a vivir alrededor de los 600 años.";

		altura = new double[] { 1.20, 1.50 };
		edad = new int[] { 50, 600 };
		Raza = "Enano";

	}
}
