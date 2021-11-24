/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */
package Personajes;

import java.util.ArrayList;

public abstract class Razas {
//Se crean los atributos que usaran las clases hijas para guardar la informacion

    private int numRandom;
    protected String[] colorOjos;
    protected String[] colorCabello;
    protected String[] colorPiel;
    protected String[] armas;
    protected double[] altura;
    protected int[] edad;
    private String descripcion;
    private String Raza;
// Se crean los arraylist con los que se manejara mejor la informacion del personaje
    protected ArrayList<String> Ojos;
    protected ArrayList<String> Cabello;
    protected ArrayList<String> Piel;
    protected ArrayList<String> arma;

    // Se crean atributos para guardar la informacion que sera enviada a la consola
    private String OjosFinal;
    private String CabelloFinal;
    private String PielFinal;
    private String armasFinal;
    private double AlturaFinal;
    private int EdadFinal;

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOjosFinal() {
        return OjosFinal;
    }

    public void setOjosFinal(String OjosFinal) {
        this.OjosFinal = OjosFinal;
    }

    public String getCabelloFinal() {
        return CabelloFinal;
    }

    public void setCabelloFinal(String CabelloFinal) {
        this.CabelloFinal = CabelloFinal;
    }

    public String getPielFinal() {
        return PielFinal;
    }

    public void setPielFinal(String PielFinal) {
        this.PielFinal = PielFinal;
    }

    public String getArmasFinal() {
        return armasFinal;
    }

    public void setArmasFinal(String armasFinal) {
        this.armasFinal = armasFinal;
    }

    public double getAlturaFinal() {
        return AlturaFinal;
    }

    public void setAlturaFinal(double AlturaFinal) {
        this.AlturaFinal = AlturaFinal;
    }

    public int getEdadFinal() {
        return EdadFinal;
    }

    public void setEdadFinal(int EdadFinal) {
        this.EdadFinal = EdadFinal;
    }

    // Metodo Liskov que recibe un objeto plantilla, pero que en realidad recibira
    // objetos
    // que heredan de plantilla
    // El metodo se encrga de obtener, randomizar y guardar la informacion que seria
    // enviada a la consola
    public void Liskov(Razas plan) {
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
