/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */

package Personajes;

public class Impresion {
	public void porConsola(Plantilla plan) {

		System.out.println("El personaje es de raza " + plan.Raza);
		System.out.println("El personaje tiene un tono de piel " + plan.PielFinal);
		System.out.println("El color de cabello del personaje es " + plan.CabelloFinal);
		System.out.println("Los ojos del personaje son de color " + plan.OjosFinal);
		System.out.println("El personaje mide " + plan.AlturaFinal + " metros");
		System.out.println("El personaje tiene " + plan.EdadFinal + " años");
		System.out.println("El arma inicial del personaje es " + plan.armasFinal);
		System.out.println("Descripcion del Personaje: " + plan.descripcion);
	}
}
