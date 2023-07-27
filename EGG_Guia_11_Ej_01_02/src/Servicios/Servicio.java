
package Servicios;

import Entidades.Humano;
import Entidades.Perro;
import java.util.Scanner;

public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Perro perro = new Perro();
    Humano persona = new Humano();

    public void crearPerro() {
        
        System.out.println("Ingrese nombre del perro");
        perro.setNombre(leer.next());
        System.out.println("Ingrese edad del perro");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese raza del perro");
        perro.setRaza(leer.next());
        System.out.println("Ingrese tamaño del perro");
        perro.setTamaño(leer.next());
        System.out.println(perro);

    }
    
    public void crearHumano(){
        System.out.println("Ingrese nombre Humano");
        persona.setNombre(leer.next());
        System.out.println("Ingrese apellido Humano");
        persona.setApellido(leer.next());
        System.out.println("Ingrese dni Humano");
        persona.setDocumento(leer.nextInt());
        System.out.println("Ingrese edad Humano");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese perro");
        persona.setPerro(leer.next());
        
        System.out.println(persona);
        
    }
}
