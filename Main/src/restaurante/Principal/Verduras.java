/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.Principal;

import java.util.Scanner;

/**
 * la clase Verduras muestra las opciones para escoger un elemento del
 * plato fuerte
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Verduras extends Principal {
     @Override
    public void seleccionar() {
        do{
             System.out.println("seleccione la verdura para su plato");
        System.out.println("1. pure de ahuyama");
        System.out.println("2. habichuelas");
        System.out.println("3. ensalada de aguacate");
        System.out.println("4. ensalada roja");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="pure de ahuyama";
               break;
           case 2:
               sel="habichuelas";
               break;
           case 3:
               sel="ensalada de aguacate";
               break;
           case 4:
               sel="ensalada roja";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de verduras valida");
       }
    }while(seleccion>4);  
}
}
