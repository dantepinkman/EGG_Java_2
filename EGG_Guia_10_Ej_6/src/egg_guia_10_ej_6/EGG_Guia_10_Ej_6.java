//6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package egg_guia_10_ej_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class EGG_Guia_10_Ej_6 {

    public static void main(String[] args) {

        HashMap<String, Double> producto = new HashMap();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Tienda:");
        String res;
        String nombre;
        Double precio;

        do {
            System.out.println("Ingrese Producto a agregar...");
            nombre = leer.next();
            System.out.println("Ingrese precio del producto...");
            precio = leer.nextDouble();

            producto.put(nombre, precio);

            System.out.println("Desea agregar mas productos? S/N");
            res = leer.next();
        } while (res.equalsIgnoreCase("S"));

        System.out.println("Ingrese producto a modificar");
        String producto2 = leer.next();
        Double precio2;
        if (producto.containsKey(producto2)) {

            System.out.println("Ingrese el nuevo precio");
            precio2 = leer.nextDouble();
            producto.replace(producto2, precio2);

        }
        
        for (Map.Entry<String, Double> entry : producto.entrySet()) {
            
            Object key = entry.getKey(); // valor de la key de cada objeto en el map
            Object val = entry.getValue(); // valor 
            
            
            
            
            
        }

    }

}
