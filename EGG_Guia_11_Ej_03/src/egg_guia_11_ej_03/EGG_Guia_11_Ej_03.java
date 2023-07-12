package egg_guia_11_ej_03;

import Servicios.ServicioBaraja;
import java.util.Scanner;

public class EGG_Guia_11_Ej_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioBaraja sb = new ServicioBaraja();
        int respuesta = 0;

        do {
            System.out.println("Que opcion desea elegir:"
                    + "\n1-Crear Baraja"
                    + "\n2-Barajar"
                    + "\n3-Siguiente Carta"
                    + "\n4-Cartas Disponibles"
                    + "\n5-Dar Cartas"
                    + "\n6-Mostrar Monton de Cartas"
                    + "\n7-Mostrar Baraja"
                    + "\n8-Salir");

            switch (leer.nextInt()) {

                case 1:
                    sb.crearBaraja();
                    break;
                case 2:
                    sb.barajar();
                    break;
                case 3:
                    sb.siguienteCarta();
                    break;
                case 4:
                    sb.cartasDisponibles();
                    break;
                case 5:
                    sb.darCartas();
                    break;
                case 6:
                    sb.cartasMonton();
                    break;
                case 7:
                    sb.mostrarBaraja();
                    break;
                case 8:
                    respuesta = 1;

            }
        } while (respuesta == 0);

    }

}
