/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */
package Personajes;

public class Impresion {

    public void porConsola(Razas plan) {

        System.out.println("El personaje es de raza " + plan.getRaza());
        System.out.println("El personaje tiene un tono de piel " + plan.getPielFinal());
        System.out.println("El color de cabello del personaje es " + plan.getCabelloFinal());
        System.out.println("Los ojos del personaje son de color " + plan.getOjosFinal());
        System.out.println("El personaje mide " + plan.getAlturaFinal() + " metros");
        System.out.println("El personaje tiene " + plan.getEdadFinal() + " años");
        System.out.println("El arma inicial del personaje es " + plan.getArmasFinal());
        System.out.println("Descripcion del Personaje: " + plan.getDescripcion());
    }
}
