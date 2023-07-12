package Entidades;

public class Animal {

    protected String nombre;
    protected int edad;
    protected String alimento;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, int edad, String alimento, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }

    public void alimentacion() {
        System.out.println(alimento);
    }
    
    
}
