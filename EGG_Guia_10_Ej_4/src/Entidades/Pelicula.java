
package Entidades;

import java.util.Comparator;

public class Pelicula {
    
    private String Titulo;
    private String Director;
    private Double Duracion;

    public Pelicula(String Titulo, String Director, Double Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getTitulo().compareTo(p1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getDirector().compareTo(p1.getDirector());
        }
    };
    

    public Pelicula() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }
    
    
    
}
