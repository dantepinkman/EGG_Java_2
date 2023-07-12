/*
 * 5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package egg_guia_10_ej_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EGG_Guia_10_Ej_5 {

    public static void main(String[] args) {

        HashSet<String> pais = new HashSet();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String res;
        do {
            System.out.println("Ingrese un Pais");
            pais.add(leer.next());
            System.out.println("Desea agregar ostro pais? S/N");
            res = leer.next();
        } while (res.equalsIgnoreCase("s"));
        
        
        
        for (String pai : pais) {
            System.out.println("Pais: " + pai);
        }
        System.out.println("--------------------");
        ArrayList<String> nombre = new ArrayList(pais);
        Collections.sort(nombre);
        
        System.out.println("--------------------");
        System.out.println("Se ordena Alfabeticamente:");
        
        for (String n : nombre) {
            System.out.println("Pais: " + n);
        }
        
        String res2;
        boolean aux = false;
        
        System.out.println("Que pais desea Borrar?");
        res2 = leer.next();
        Iterator<String> paisBorrar = pais.iterator();

        System.out.println("-------------------");

        while (paisBorrar.hasNext()) {
            if (paisBorrar.next().equals(res2)) {
                paisBorrar.remove();
                aux = true;
            }
        }

        if (aux == false) {
            System.out.println("No se encontro el pais");
        }

        for (String pai : pais) {
            System.out.println("Pais: " + pai);
        }

    }

}
