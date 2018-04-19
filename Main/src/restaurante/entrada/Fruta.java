/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.entrada;

import java.util.Scanner;

/**
 * la clase Fruta contine los elemntos para escoger
 * un tipo de fruta especifico
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Fruta extends Entrada {

    @Override
    public void seleccionar() {
        do{
        System.out.println("1. papaya");
        System.out.println("2. manzana");
        System.out.println("3. pera");
        System.out.println("4. melon");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="papaya";
               break;
           case 2:
               sel="manzana";
               break;
           case 3:
               sel="pera";
               break;
           case 4:
               sel="melon";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de fruta valida");
       }
    }while(seleccion>4);  
    }
    
}
