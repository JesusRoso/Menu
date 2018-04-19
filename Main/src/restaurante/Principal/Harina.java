/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.Principal;

import java.util.Scanner;

/**
 * la clase Harina muestra las opciones para escoger un elemento del
 * plato fuerte
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Harina extends Principal {
    
    @Override
    public void seleccionar() {
        do{
        System.out.println("seleccione la harina para su plato");
        System.out.println("1. yuca");
        System.out.println("2. papa");
        System.out.println("3. pasta");
        System.out.println("3. arroz");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="yuca";
               break;
           case 2:
               sel="papa";
               break;
           case 3:
               sel="pasta";
               break;
           case 4:
               sel="arroz";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de proteina valida");
       }
    }while(seleccion>4);  
    }
    
}
