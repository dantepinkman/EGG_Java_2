package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> p = new ArrayList();
    
    public void crearPelicula() {

        String nombre = "";
        String director ;
        Double duracion ;
        String continuar = "no";

        do {
            System.out.println("");
            System.out.println("Ingrese nombre");
            nombre = leer.next();
            System.out.println("Ingrese director");
            director = leer.next();
            System.out.println("Ingrese Duracion");
            duracion = leer.nextDouble();

            p.add(new Pelicula(nombre, director, duracion));

            System.out.println("Desea continuar?");
            continuar = leer.next();

        } while ("si".equalsIgnoreCase(continuar));

        //return new Pelicula(nombre, director, duracion);
    }

    public void mostrarPelicula() {
        for (Pelicula pelicula : p) {
            System.out.println("Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duracion: " + pelicula.getDuracion());
        }
        
        for (Pelicula pelicula : p) {
            if (pelicula.getDuracion() > 1.0) {
                System.out.println("Esta pelicula dura mas de una hora: " + pelicula.getTitulo());
            }
        }
        
        Collections.sort(p, Pelicula.compararDuracion);
        
        for (Pelicula pelicula : p) {
            System.out.println("Ordenado de mayor a menor: Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duracion: " + pelicula.getDuracion());
        }
        
        Collections.sort(p, Pelicula.compararDuracion.reversed());
        for (Pelicula pelicula : p) {
             System.out.println("Ordenado de mmenor a mayor: Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duracion: " + pelicula.getDuracion());
        }
        
        Collections.sort(p, Pelicula.compararTitulo);
        for (Pelicula pelicula : p) {
             System.out.println("Ordenando Alfabeticamente por Titulo: Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duracion: " + pelicula.getDuracion());
        }
        Collections.sort(p, Pelicula.compararDirector);
        for (Pelicula pelicula : p) {
             System.out.println("Ordenando Alfabeticamente por Director: Titulo: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duracion: " + pelicula.getDuracion());
        }
        
    }
    
    

}
