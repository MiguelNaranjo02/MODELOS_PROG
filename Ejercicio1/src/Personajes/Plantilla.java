/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */

package Personajes;

import java.util.ArrayList;

public abstract class Plantilla {
//Se crean los atributos que usaran las clases hijas para guardar la informacion

	int numRandom;
	String[] colorOjos;
	String[] colorCabello;
	String[] colorPiel;
	String[] armas;
	String descripcion;
	double[] altura;
	int[] edad;
	String Raza;
// Se crean los arraylist con los que se manejara mejor la informacion del personaje
	ArrayList<String> Ojos;
	ArrayList<String> Cabello;
	ArrayList<String> Piel;
	ArrayList<String> arma;

	// Se crean atributos para guardar la informacion que sera enviada al servlet
	String OjosFinal;
	String CabelloFinal;
	String PielFinal;
	String armasFinal;
	double AlturaFinal;
	int EdadFinal;

	// Getters y setters de la informacion que sera enviada al servlet
	public String getOjosFinal() {
		return OjosFinal;
	}

	public String getCabelloFinal() {
		return CabelloFinal;
	}

	public String getPielFinal() {
		return PielFinal;
	}

	public String getArmasFinal() {
		return armasFinal;
	}

	public double getAlturaFinal() {
		return AlturaFinal;
	}

	public int getEdadFinal() {
		return EdadFinal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// Metodo Liskov que recibe un objeto plantilla, pero que en realidad recibira
	// objetos
	// que heredan de plantilla
	// El metodo se encrga de obtener, randomizar y guardar la informacion que seria
	// enviada al servlet
	public void Liskov(Plantilla plan) {
		this.numRandom = (int) Math.floor(Math.random() * (plan.Ojos.size() - 1 - 0 + 1) + 0);
		this.OjosFinal = plan.Ojos.get(numRandom);

		this.numRandom = (int) Math.floor(Math.random() * (plan.Cabello.size() - 1 - 0 + 1) + 0);
		this.CabelloFinal = plan.Cabello.get(numRandom);

		this.numRandom = (int) Math.floor(Math.random() * (plan.Piel.size() - 1 - 0 + 1) + 0);
		this.PielFinal = plan.Piel.get(numRandom);

		this.numRandom = (int) Math.floor(Math.random() * (plan.arma.size() - 1 - 0 + 1) + 0);
		this.armasFinal = plan.arma.get(numRandom);

		this.AlturaFinal = Math.random() * ((double) plan.altura[0] - (double) plan.altura[1])
				+ (double) plan.altura[1];
		this.AlturaFinal = Math.round(this.AlturaFinal * 100.0) / 100.0;
		this.EdadFinal = (int) Math.floor(Math.random() * (plan.edad[0] - plan.edad[1] + 1) + plan.edad[1]);
		this.descripcion = plan.descripcion;

	}

}
