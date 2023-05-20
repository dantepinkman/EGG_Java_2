
package Entidades;

public class Auto {
    
    private String Marca;
    private String Modelo;
    private double version;
    private String color;

    public Auto(String Modelo, String Marca, double version, String color) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.version = version;
        this.color = color;
    }
    
    public Auto(String Modelo, String Marca) {
        this.Modelo = Modelo;
        this.Marca = Marca;
    }
    
    
    
}
