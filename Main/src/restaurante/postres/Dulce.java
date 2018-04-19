/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.postres;

import java.util.Scanner;

/**
 * la clase Dulce muestra las opciones que puede elegir cuando selecciona
 * un postre de dulce
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Dulce extends Postre{
    public void seleccionar() {
        do{
        System.out.println("1. helado");
        System.out.println("2. chocolate");
        System.out.println("3. arequipe");
        System.out.println("4. dulce de fruta");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="helado";
               break;
           case 2:
               sel="chocolate";
               break;
           case 3:
               sel="arequipe";
               break;
           case 4:
               sel="dulce de fruta";
               break;
           default: 
               System.out.println("por favor seleccione una opcion de fruta valida");
       }
    }while(seleccion>4);  
}
}

