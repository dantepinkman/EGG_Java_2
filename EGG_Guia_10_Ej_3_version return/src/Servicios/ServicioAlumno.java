package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    //ArrayList<Alumno> a = new ArrayList();   //Alumno a[] = new Alumno[5];   //Alumno a = new Alumno();
    ArrayList<Alumno> a = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
/*
    public Alumno cargaAlumno() {

        ArrayList<Integer> n = new ArrayList();

        System.out.println("Ingrese Nombre:");
        String nombre = leer.next();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota");
            n.add(leer.nextInt());
        }
        ArrayList<Integer> nota = n;

        return new Alumno(nombre, nota);
    }
*/
    
    public Alumno cargaAlumno2() {
        
        String respuesta = "";
        ArrayList<Integer> n = new ArrayList();
        String nombre="";

        do {
            System.out.println("Ingrese Nombre:");
            nombre = leer.next();
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota");
                n.add(leer.nextInt());
            }
            System.out.println("Desea Agregar mas alumnos? S/N");
            respuesta = leer.next();
            //ArrayList<Integer> nota = n;
        } while ("S".equalsIgnoreCase(respuesta));
        ArrayList<Integer> nota = n;
        
        System.out.println("Ingrese nombre alumno a buscar");
        boolean pregunta = a.contains(leer.next());
        System.out.println(pregunta);
        
        return new Alumno(nombre, nota);
    }
    
   
    
    
    public void notaFinal(Alumno cargaAlumno2){
        
        for (Alumno alumno : a) {
            System.out.println(a.get(1));
        }
        
    }

}
