
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> raza = new ArrayList();
        String respuesta;
        
        do {
            System.out.println("Ingrese una Raza");
            raza.add(leer.next());
            System.out.println("Desea agregar otro más? S/N");
            respuesta = leer.next();
            
        } while (respuesta.equalsIgnoreCase("S"));
        
        System.out.println("Mostramos la Lista:");
        
        for (String mostrarRaza : raza) {                   // poner fore y apretar tab
            System.out.println(mostrarRaza);
        }
        
        System.out.println("Ingrese una de las Razas anteriormente nombrada...");
        String borrar = leer.next();
        
        Iterator<String> borrarRaza = raza.iterator();
         int contador = 0;
         
        while (borrarRaza.hasNext()) {  
            
            if (borrarRaza.next().equals(borrar)) {
                borrarRaza.remove();
                System.out.println("Borrado la raza: " + borrar);
                 contador ++;
            } else {
               
            }
        }
        
        if (contador == 0 ){
             System.out.println("No se encuentra esa Raza");
        }
        
        System.out.println("Mostramos la Lista:");
        for (String mostrarRaza : raza) {                   // poner fore y apretar tab
            System.out.println(mostrarRaza);
        }
        
        System.out.println("Mostramos la lista ordenada");
        Collections.sort(raza);
        
        for (String mostrarRaza : raza) {                   // poner fore y apretar tab
            System.out.println(mostrarRaza);
        }
        
        
    }
    
}
