/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.bebidas;

import restaurante.bebidas.Bebidas;

/**
 * la clase Licores muesra las opciones para elegir un 
 * tipo especifico de licor
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Licores extends Bebidas {
    
    @Override
    public void seleccionar() {
         switch (seleccion){
           case 1: 
               sel="cerveza";
               break;
           case 2:
               sel="vino";
               break;
           case 3:
               sel="coctel";
               break;
           case 4:
               sel="aguardinte";
               break;
           default: 
               System.out.println("por favor seleccione una gaseosa");
       }
    }
    
}
