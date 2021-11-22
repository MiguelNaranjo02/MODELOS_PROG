/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */
package Personajes;

import java.util.ArrayList;
import java.util.Arrays;

//Clase Humano que hereda de Plantilla
public class Humano extends Plantilla {
//Constructor que inicializa y guarda la informacion especifica del Humano en los arreglos

    public Humano() {
        colorOjos = new String[4];
        String[] colorOjos = {"Negros", "Cafes", "Azules", "Verdes"};
        Ojos = new ArrayList<String>(Arrays.asList(colorOjos));

        colorCabello = new String[2];
        String[] colorCabello = {"Castaño", "Negro"};
        Cabello = new ArrayList<String>(Arrays.asList(colorCabello));

        colorPiel = new String[3];
        String[] colorPiel = {"Blanco", "Trigueño", "Moreno"};
        Piel = new ArrayList<String>(Arrays.asList(colorPiel));

        armas = new String[3];
        String[] armas = {"Espada de los Hombres", "Espada y Escudo", "Arco y Flechas"};
        arma = new ArrayList<String>(Arrays.asList(armas));
        setDescripcion("Poco se dice de los hombres en los relatos de los Días Antiguos, se sabe "
                + "que despertaron en Hildórien, en las regiones mas orientales de la Tierra Media"
                + " durante la Primera Edad del Sol. Los hombres llegaron a Beleriand, avanzada la"
                + " Primera Edad, sus vidas eran cortas ya que morían pronto, pero a diferencia de"
                + " los elfos su natalidad era muchísimo mayor.\n" + "\n"
                + "Los hombres de la Primera Edad no crearon grandes ciudades, bueno ni grandes ni"
                + " pequeñas, eran eminentemente rurales. A medida que llegaban se establecieron en"
                + " Estolad, en el este, pero luego migraron a sus destinos definitivos, sin embargo"
                + " siempre hubo hombres en esta region, sobretodo en la zona oriental, no de una"
                + " casa definida, eran una mezcolanza de las tres. Antes de la Dagor Bragollach "
                + "(Batalla de la Llama Súbita) habría unos 25.000 habitantes distribuidos por la" + " región.\n"
                + "\n" + "Hay distinción entre los hombres propiamente dichos y otros seres humanoides "
                + "como los hobbits (que probablemente fueran hombres en sus orígenes) y los magos"
                + " que por su apariencia se pensó que eran hombres.");

        altura = new double[]{1.60, 1.90};
        edad = new int[]{20, 70};
        setRaza("Humano");

    }

}
