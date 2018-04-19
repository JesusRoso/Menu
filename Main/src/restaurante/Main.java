/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante;
import GUI.interfaz.interfaz;
import restaurante.bebidas.Bebidas;
import restaurante.bebidas.Gaseosas;
import restaurante.bebidas.Jugos;
import restaurante.bebidas.Licores;
import restaurante.entrada.Fruta;
import restaurante.entrada.Sopas;
import restaurante.entrada.Entrada;
import restaurante.Principal.Principal;
import restaurante.Principal.Granos;
import restaurante.Principal.Harina;
import restaurante.Principal.Proteina;
import restaurante.Principal.Verduras;
import java.util.Scanner;
import restaurante.postres.Postre;
import restaurante.postres.Sal;
import restaurante.postres.Dulce;
/**
 * la clase main es la que guarda los datos de las clases heredadas y los muestra 
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        interfaz principal = new interfaz();
        principal.setVisible(true);
        
         int s;
         String respuestab;
         String respuestae;
         String respuestap;
         
         
        Bebidas j = new Jugos();
        Bebidas g = new Gaseosas();
        Bebidas l = new Licores();
        Entrada so = new Sopas();
        Entrada f = new Fruta();
        Principal gr = new Granos();
        Principal pr = new Proteina();
        Principal ha = new Harina();
        Principal vr = new Verduras();
        Postre dul = new Dulce();
        Postre sal = new Sal();
        
        System.out.println("por favor seleccione entrada");
        System.out.println("1.sopa");
        System.out.println("2.fruta");
     
        Scanner en=new Scanner (System.in);
        s=en.nextInt();
        switch (s){
            case 1:
                so.seleccionar();
                 respuestae=so.sel;
                break;
            default: 
                f.seleccionar();
                 respuestae=f.sel;
        }
        System.out.println("la entrada seleccionada fue"+respuestae);
        
        System.out.println("por favor seleccione los elementos de su plato principal");
        gr.seleccionar();
        System.out.println("el grano seleccionado fue "+gr.sel);
        pr.seleccionar();
        System.out.println("la proteina seleccionado fue "+pr.sel);
        ha.seleccionar();
        System.out.println("el harina seleccionado fue "+ha.sel);
        vr.seleccionar ();
        System.out.println("la verdura seleccionado fue "+vr.sel);
        
        System.out.println("por favor seleccione bebida");
        System.out.println("1. jugos");
        System.out.println("2.gaseosas");
        System.out.println("3.licores");
        
        Scanner po=new Scanner (System.in);
        s=po.nextInt();
             
        switch (s){
            case 1:
                j.seleccionar();
                respuestab=j.sel;
                break;
            case 2:
                g.seleccionar();
                respuestab=g.sel;
                break;
            default: 
                l.seleccionar();
                respuestab=l.sel;
        }
        System.out.println("la bebida seleccionda fue"+respuestab);
        
        System.out.println("por favor seleccione la clase de postre");
        System.out.println("1. dulce");
        System.out.println("2. sal");
        
        Scanner sc=new Scanner (System.in);
        s=sc.nextInt();
        
         switch (s){
            case 1:
                dul.seleccionar();
                respuestap=dul.sel;
                break;
            default: 
                sal.seleccionar();
                respuestap=sal.sel;
        }
        
        
        
        System.out.println("su menu seleccionado fue");
        System.out.println("ENTRADA");
        System.out.println(respuestae);
        System.out.println("PLATO PRINCIPAL");
        System.out.println(gr.sel);
        System.out.println(pr.sel);
        System.out.println(ha.sel);
        System.out.println(vr.sel);
        System.out.println("BEBIDA");
        System.out.println(respuestab);
        System.out.println("POSTRE");
        System.out.println(respuestap);        
        
      
    }
    
 
}
