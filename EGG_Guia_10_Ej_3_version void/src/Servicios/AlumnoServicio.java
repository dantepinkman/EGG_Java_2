package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    //Mascota m1 = new Mascota(); instanciar
    //public ArrayList<Alumno> cargaAlumno() { Crear arraylist
    //public 
    //Pm TAB
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaDeAlumnos = new ArrayList();
     
    public void cargaAlumno() {  //va a retornar el arraylist de tipo alumno

        //Scanner leer = new Scanner(System.in).useDelimiter("\n");

       
        String respuesta = "S";
        String nombre;

        do {
            System.out.println("Cual es el nombre?");
            nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Cual es la nota " + (i + 1));
                notas.add(leer.nextInt());
            }

            //Alumno aux = new Alumno(nombre, notas);
            //listaDeAlumnos.add(aux)
            
            listaDeAlumnos.add(new Alumno(nombre, notas)); 

            System.out.println("Desea agregar mas alumnos? S/N");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("S"));
        /*
        for (int i = 0; i < 10; i++) { 
        }
        
        for (Alumno listaDeAlumno : listaDeAlumnos) { 
        }
         */
        
    }

    public void ingreseAlunmno() {
        String nombreBuscar;
        System.out.println("Ingrese un alumno para calcular promedio");
        nombreBuscar = leer.next();
        
        for (Alumno a1 : listaDeAlumnos) {
            if (nombreBuscar.equalsIgnoreCase(a1.getNombre())) {
                notaFinal(a1.getNota());
            }
        }
        
    }

    public void notaFinal(ArrayList<Integer> notas1) {
        
        double suma = 0;
        double promedio;
//
//        for (int i = 0; i < notas1.size(); i++) {
//            suma += notas1.get(i);
//        }
//        
        for (Integer aux : notas1) {
            suma += aux;
        }
        
        promedio = suma / notas1.size();
        System.out.println("El promedio es " + promedio);
    }

}
