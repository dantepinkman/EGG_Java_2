
package Entidades;

public class CalculosFormas {
    
    protected double perimetro;
    protected double pi = Math.PI;
    protected double area;

    public CalculosFormas(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }
    
    public void area(){
        System.out.println(area);
    }
    
    public void perimetro(){
        System.out.println(perimetro);
    }
    
}
