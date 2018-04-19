/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.entrada;

/**
 * la clase Entrada crea la variable donde se guardaran los datos del 
 * elemento escogidos para formar la entrada del menu
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public abstract class Entrada {
    int seleccion;
    public String sel;
    
    public abstract void seleccionar();
}
