
package Logica;

public class POO {
    
   
     public static void main(String[] args) {
         
         Alumno a1 = new Alumno (5,"a","b",5);
         Alumno a2 = new Alumno ();
         
         String apellido = a1.getApellido();
         
         System.out.println("la id del alumno 1 es" + a1.id);
         
         a1.setId(10);
         a1.setApellido("caca");
         
         System.out.println("El id es " + a1.id);
         
         System.out.println("-------------------------------");
         int id = 100;
         id = a2.id;
         a2.setId(50);
         System.out.println(a2.id);
         System.out.println(a2.getId());
         
         a1.mostrarNombre();
         
         double calificacion = 100;
         a1.saberAprobado();
         
    }
     
     
     
     
}
