package Entidades;

import java.util.List;

public class Humano {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private List<Perro> perro;

    public Humano() {
    }

    public Humano(String nombre, String apellido, int edad, int documento, List<Perro> perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public List<Perro> getPerro() {
        return perro;
    }

    public void setPerro(List<Perro> perro) {
        this.perro = perro;
    }

}
