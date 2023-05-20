
import java.util.ArrayList;
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
        
    }
    
}
