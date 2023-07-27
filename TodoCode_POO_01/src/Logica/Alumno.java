package Logica;

import java.util.Scanner;

public class Alumno {

    int id;
    String nombre;
    String apellido;
    double calificacion;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    

    public void mostrarNombre() {
        System.out.println("Hola");
        calificacion = (leer.nextInt());
    }

    public void saberAprobado() {
        if (calificacion >= 6) {
            System.out.println("Aprobe" + calificacion);
            
        } else {
            System.out.println("desAprobe");
        }
    }
    
}
