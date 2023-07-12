
package Entidades;

public class Pais {
    
    private String nombre;
    private int poblacion;
    private int provincia;

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", poblacion=" + poblacion + ", provincia=" + provincia + '}';
    }
    
    

    public Pais() {
    }

    public Pais(String nombre, int poblacion, int provincia) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }
    
    
}
