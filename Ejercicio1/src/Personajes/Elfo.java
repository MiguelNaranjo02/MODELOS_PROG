/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */

package Personajes;

import java.util.ArrayList;
import java.util.Arrays;

//Raza elfo que hereda de Plantilla
public class Elfo extends Plantilla {

	// Constructor que inicializa y guarda la informacion especifica del Elfo en los
	// arreglos
	public Elfo() {
		colorOjos = new String[3];
		String[] colorOjos = { "Azules", "Verdes", "Avellana" };
		Ojos = new ArrayList<String>(Arrays.asList(colorOjos));

		colorCabello = new String[3];
		String[] colorCabello = { "Rubio", "Plateado", "Negro" };
		Cabello = new ArrayList<String>(Arrays.asList(colorCabello));

		colorPiel = new String[2];
		String[] colorPiel = { "Blanco", "Palido" };
		Piel = new ArrayList<String>(Arrays.asList(colorPiel));

		armas = new String[3];
		String[] armas = { "Arco y Flechas", "Daga Elfica", "Espada de los Altos Elfos" };
		arma = new ArrayList<String>(Arrays.asList(armas));
		setDescripcion("Los Elfos son seres inmortales que no envejecen como los mortales. "
				+ "A los 50 años de edad, los elfos alcanzan el aspecto final que tendrán "
				+ "el resto de su existencia y su crecimiento o desarrollo físico se detiene "
				+ "al alcanzar los 100. Su desarrollo es claramente mucho más lento que el de los "
				+ "mortales. Por lo que a la edad de 50 años pueden aparentar el aspecto fisico "
				+ "de los hombres en su juventud. Sin embargo, mentalmente crecen más rapido que los "
				+ "mortales, aprendiendo a andar y hablar con menos de 1 año.\n" + "\n"
				+ "Son más presistentes en mente y espiritu que los hombres y los enanos y son tambien más hábiles que estos. Poseen una visión muy superior, se recuperan antes de las heridas y no sufren de vejez o enfermedades de ningun tipo.");

		altura = new double[] { 1.77, 1.85 };
		edad = new int[] { 50, 100 };
		setRaza("Elfo");

	}

}
