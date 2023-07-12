
package Entidades;

import java.util.Scanner;

public class Rectangulo extends CalculosFormas{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo(double perimetro, double area) {
        super(perimetro, area);
    }
    
    private double base;
    private double altura;
    
    @Override
    public void perimetro() {
        System.out.println("Ingrese Base");
        base = leer.nextDouble();
        
        System.out.println("Ingrese Altura");
        altura = leer.nextDouble();
        
        super.perimetro = (base + altura )*2;
        super.perimetro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void area() {
        super.area = base * altura;
        super.area(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   
    
}
