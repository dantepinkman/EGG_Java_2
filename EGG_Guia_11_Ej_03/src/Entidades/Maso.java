
package Entidades;

import java.util.ArrayList;

public class Maso {
    
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> monton;

    public Maso() {
    }

    public Maso(ArrayList<Carta> baraja, ArrayList<Carta> monton) {
        this.baraja = baraja;
        this.monton = monton;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    @Override
    public String toString() {
        return "Baraja: " + baraja;
    }
    
    
    
}
