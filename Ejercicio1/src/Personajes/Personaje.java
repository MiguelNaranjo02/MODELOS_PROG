/**
 *
 * @authors Miguel Naranjo y Cristian Tuso
 */
package Personajes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Personaje {

    public static void main(String Arg[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Seleccione un personaje:");
        System.out.println("1.Elfo");
        System.out.println("2.Enano");
        System.out.println("3.Humano");
        Impresion impr = new Impresion();

        int opc;
        opc = Integer.parseInt(in.readLine());
        Razas planti = null;
        switch (opc) {
            case 1:
                planti = new Elfo();
                break;
            case 2:
                planti = new Enano();
                break;
            case 3:
                planti = new Humano();
                break;
            default:

        }
        planti.Liskov(planti);
        impr.porConsola(planti);

    }
}
