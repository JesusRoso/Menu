/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante.bebidas;

import restaurante.bebidas.Bebidas;
import java.util.Scanner;

/**
 * la clase Gaseosas muestra las opciones para elegir
 * un tipo especifico de gaseosa
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Gaseosas extends Bebidas{

    @Override
    public void seleccionar() {
        do{
        System.out.println("1. cocacola");
        System.out.println("2. cuatro");
        System.out.println("3. 7up");
        Scanner sc=new Scanner (System.in);
        seleccion=sc.nextInt();
         switch (seleccion){
           case 1: 
               sel="cocacola";
               break;
           case 2:
               sel="cuatro";
               break;
           case 3:
               sel="7uo";
               break;
           case 4:
               sel="pepsi";
               break;
           default: 
               System.out.println("por favor seleccione opcion valida de gaseosa");
       }
    }while(seleccion>4);  
}
}
