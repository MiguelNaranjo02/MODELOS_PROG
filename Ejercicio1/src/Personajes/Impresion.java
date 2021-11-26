package Personajes;

/**
 * Clase Impresion
 * 
 * Clase destinada a la impresion por pantalla de los datos del personaje
 * seleccionado.
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 18/11/2021
 */

public class Impresion {

	/**
	 * Metodo que instancia un objeto de tipo raza para obtener sus atributos
	 * guardados e imprimirlos para la su visualizacion por consola.
	 * 
	 * @param plan Este parametro obtiene los datos de la clase Razas y los imprime
	 *             en la consola.
	 */

	public void porConsola(Razas plan) {

		/*
		 * Impresion en la consola de los datos del personaje guardado.
		 */

		System.out.println("El personaje es de raza " + plan.getRaza() + ". \n");
		System.out.println("El personaje tiene un tono de piel " + plan.getPielFinal() + ". \n");
		System.out.println("El color de cabello del personaje es " + plan.getCabelloFinal() + ". \n");
		System.out.println("Los ojos del personaje son de color " + plan.getOjosFinal() + ". \n");
		System.out.println("El personaje mide " + plan.getAlturaFinal() + " metros. \n");
		System.out.println("El personaje tiene " + plan.getEdadFinal() + " años. \n");
		System.out.println("El arma inicial del personaje es " + plan.getArmasFinal() + ". \n");
		System.out.println("Descripcion del Personaje: " + plan.getDescripcion() + ". \n");
	}
}
