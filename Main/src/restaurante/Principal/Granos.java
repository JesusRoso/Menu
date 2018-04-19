/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.Principal;

import java.util.Scanner;

/**
 * la clase Granos muestra las opciones para escoger un elemento del 
 * plato fuerte
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Granos extends Principal {
    public void seleccionar() {
        do{
        System.out.println("seleccione el grano para su plato");
        System.out.println("1. lenteja");
        System.out.println("2. frijoles");
        System.out.println("3. garbanzo");
        System.out.println("4. arveja");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="lenteja";
               break;
           case 2:
               sel="frijole";
               break;
           case 3:
               sel="garbanzo";
               break;
           case 4:
               sel="arveja";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de grano valida");
       }
    }while(seleccion>4);  
}
}
