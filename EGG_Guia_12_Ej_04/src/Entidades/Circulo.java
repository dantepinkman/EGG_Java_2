
package Entidades;

import java.util.Scanner;

public class Circulo extends CalculosFormas {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circulo(double perimetro, double area) {
        super(perimetro, area);
    }
    private double radio;
    
    public Circulo(double radio, double perimetro, double area) {
        super(perimetro, area);
        this.radio = radio;
    }

    @Override
    public void perimetro() {
        System.out.println("Ingrese el Radio");
        radio = leer.nextDouble();
        super.perimetro=radio*2*super.pi;
        super.perimetro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void area() {
        super.area = super.pi * radio;
        super.area(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
