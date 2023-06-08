/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.LocalEntidades;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sohai
 */
public class LocalService {
    
    public void crearProducto(ArrayList<LocalEntidades> lista){
        Scanner leer = new Scanner(System.in);
        //ArrayList<LocalEntidades> lista = new ArrayList();
        
        String nombre;
        int cantidad;
        int precio;
        
        System.out.println("Ingrese el nombre del producto ");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese la cantidad del producto ");
        cantidad= leer.nextInt();
        
        System.out.println("Ingrese el precio del poducto ");
        precio= leer.nextInt();
        
        LocalEntidades producto = new LocalEntidades(nombre, cantidad, precio);
        
        lista.add(producto);
        
        
    }
    
    
    public void mostrarProductos(ArrayList<LocalEntidades> producto){
        for (LocalEntidades localEntidades : producto) {
            System.out.println(localEntidades);
        }
    }
    
    
    public void eliminarProducto(ArrayList<LocalEntidades> producto){
        Iterator<LocalEntidades> it = producto.iterator();
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese producto a eliminar ");
         
         String eliminar = leer.nextLine();
         
         while(it.hasNext()){
             LocalEntidades aux = it.next();
             
             if(aux.getNombre().equals(eliminar)){
                 it.remove();
                 System.out.println("Se elimino el producto"+eliminar);
             }
             
         }
         
    }
    
    public void modificar(ArrayList<LocalEntidades> producto, String productonombre){
        Scanner leer = new Scanner(System.in);
        boolean esta = false;
        for (LocalEntidades localEntidades : producto) {
            if(localEntidades.getNombre().equals(productonombre)){
                System.out.println("que desea modificar");
                System.out.println("1 Nombre");
                System.out.println("2 cantidad");
                System.out.println("3 precio");
                System.out.println("4 modifique todo");
               int opc=leer.nextInt();
                switch(opc){
                    case 1: 
                        System.out.println("Ingerese un nombre");
                        String nombreN = leer.next();
                        localEntidades.setNombre(nombreN);
                        esta = true;
                        break;
                    case 2: 
                        System.out.println("Ingrese la cantidad nueva");
                        int cantidadN = leer.nextInt();
                        localEntidades.setCantidad(cantidadN);
                        esta = true;
                        break;
                    case 3:
                        System.out.println("Ingrese el precio nuevo");
                        int precioN = leer.nextInt();
                        localEntidades.setPrecio(precioN);
                        esta = true;
                        break;
                    case 4:
                        System.out.println("Ingrese un nombre");
                        nombreN = leer.next();
                        localEntidades.setNombre(nombreN);
                        
                        System.out.println("Ingrese una cantidad");
                        cantidadN = leer.nextInt();
                        localEntidades.setCantidad(cantidadN);
                        
                        
                        System.out.println("Ingrese un precio");
                        precioN = leer.nextInt();
                        localEntidades.setPrecio(precioN);
                        
                        esta = true;
                        break;
                        
                        
                    default :
                        break;
                       
                        
                }
            }
            
        }
        if(!esta){
            System.out.println("el producto no esta");
        }
    }
    
    
}
