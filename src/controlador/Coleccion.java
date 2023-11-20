/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import modelo.Pelicula;
import vista.EliminarMenu;

/**
 *
 * @author Bababooey
 */
public class Coleccion {
    ArrayList<Pelicula> listaPelicula;
   
    
    public Coleccion() {
        this.listaPelicula = new ArrayList<Pelicula>();
    }
    
    public boolean agregar(Pelicula p){
        return listaPelicula.add(p);
    }
    public void listar(Pelicula p){
        for (Pelicula pelicula : listaPelicula){
            System.out.println("nombre" + pelicula.toString());
        }
    }
    
    public void modificar(Pelicula p){
        for (Pelicula pelicula : listaPelicula){
            if(pelicula.equals(p))
            listaPelicula.remove(pelicula);
            System.out.println("--modificado");
            listaPelicula.add(p);
        }
        
    }
    public void eliminar(Pelicula p){
        for (Pelicula pelicula : listaPelicula){
            if(pelicula.equals(p))
            listaPelicula.remove(pelicula);
            System.out.println("--modificado");
            
        }
        
    }
    
    public void listarString(){
       String lista = "";
       for (Pelicula pelicula : listaPelicula){
           lista = lista + "\n"+ pelicula.toString();
       }
    }
    
    
    
    
    
    
}
