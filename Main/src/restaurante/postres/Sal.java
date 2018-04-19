/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.postres;

import java.util.Scanner;

/**
 * la clase Sal muestra las opciones que puede elegir cuando selecciona
 * un postre de sal
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Sal extends Postre {

    @Override
    public void seleccionar() {
        do{
        System.out.println("1. galletas");
        System.out.println("2. waffles");
        System.out.println("3. postre 3");
        System.out.println("4. postre 4");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="galletas";
               break;
           case 2:
               sel="waffles";
               break;
           case 3:
               sel="postre 3";
               break;
           case 4:
               sel="postre 3";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de fruta valida");
       }
    }while(seleccion>4);  
    }
    
}
