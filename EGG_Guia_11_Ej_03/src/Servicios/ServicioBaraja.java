package Servicios;

import Entidades.Carta;
import Entidades.Maso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioBaraja {

    Carta c;
    Maso m;
    ArrayList<Carta> baraja = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearBaraja() {

        m = new Maso();

        String palo;
        int num = 0;

        for (int i = 0; i < 10; i++) {

            if (i >= 7) {
                num = i + 3;
            } else {
                num = i + 1;
            }

            for (int j = 1; j < 5; j++) {
                c = new Carta();
                if (j == 1) {
                    palo = "Oro";
                    c.setPalo(palo);
                    c.setNumero(num);
                    baraja.add(c);
                } else if (j == 2) {
                    palo = "Copa";
                    c.setPalo(palo);
                    c.setNumero(num);
                    baraja.add(c);
                } else if (j == 3) {
                    palo = "Espada";
                    c.setPalo(palo);
                    c.setNumero(num);
                    baraja.add(c);
                } else if (j == 4) {
                    palo = "Bastos";
                    c.setPalo(palo);
                    c.setNumero(num);
                    baraja.add(c);
                }
            }
        }
        m.setBaraja(baraja);
        System.out.println("Maso: " + baraja);
    }

    public void barajar() {
        Collections.shuffle(m.getBaraja());
        m.setBaraja(m.getBaraja());
        System.out.println("Barajado: " + m.getBaraja());
        m.setBaraja(baraja);
    }

    public void siguienteCarta() {
        c = baraja.get(0);
        baraja.remove(0);
        System.out.println(c);
        monton.add(c);
    }

    public void cartasDisponibles() {
        int suma = 0;
        for (Carta carta : baraja) {
            suma++;
            //System.out.print(carta + ", ");
        }
        //System.out.println("");
        System.out.println("Hay " + suma + " cartas disponibles.");

    }

    public void darCartas() {
        System.out.println("Cuantas Cartas Desea Dar?");
        int cantidad = leer.nextInt();
        do {
            c = baraja.get(cantidad);
            baraja.remove(cantidad);
            System.out.println(c);
            monton.add(c);
            cantidad --;
        } while (cantidad != 0);
    }
    
    public void cartasMonton(){
        int cantidad = 0;
        for (Carta carta : monton) {
            cantidad ++;
        }
        System.out.println("Hay " + cantidad + " Cartas en el monton");
    }
    
    public void mostrarBaraja(){
        int cantidad = 0;
        for (Carta carta : baraja) {
            cantidad ++;
        }
        System.out.print("En el maso hay " + cantidad + " Cartas: ");
        System.out.println(m.getBaraja());
    }
    

}
