/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.Principal;

import java.util.Scanner;

/**
 * la clase Proteina muestra las opciones para escoger un elemento del
 * plato fuerte
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Proteina extends Principal{

    @Override
    public void seleccionar() {
        do{
             System.out.println("seleccione la proteina para su plato");
        System.out.println("1. pollo");
        System.out.println("2. carne");
        System.out.println("3. pescado");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="pollo";
               break;
           case 2:
               sel="carne";
               break;
           case 3:
               sel="pescado";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de proteina valida");
       }
    }while(seleccion>3);  
    }
    
}
