/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidades.LocalEntidades;
import Servicios.LocalService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sohai
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        LocalService serv = new LocalService();
        
        ArrayList<LocalEntidades> cosas = new ArrayList<>();

        //serv.mostrarProductos(cosas);
        
        //serv.eliminarProducto(cosas);
        boolean sigo =false;
       do{
           System.out.println("que desea hacer");
                System.out.println("1 crear");
                System.out.println("2 editar");
                System.out.println("3 eliminar");
                System.out.println("4 mostrar todo");
                System.out.println("5 para salir");
                
        int opc=leer.nextInt();
        
        switch(opc){
            case 1:               
                serv.crearProducto(cosas);
                break;
            case 2: 
                System.out.println("ingrese el nombre del producto a buscar");
                serv.modificar(cosas, leer.next());
                break;
            case 3:
                serv.eliminarProducto(cosas);
                break;
            case 4:
                serv.mostrarProductos(cosas);
                break;
            case 5 :
                sigo = true;
                break;
            default:
                break;
        
        }
       }while(!sigo);
    
}
}
