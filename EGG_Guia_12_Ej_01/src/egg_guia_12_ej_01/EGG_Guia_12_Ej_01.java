
package egg_guia_12_ej_01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class EGG_Guia_12_Ej_01 {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich",15,"Carnivoro","Doberman");
        perro1.alimentacion();
        
        Animal perro2 = new Perro("pepe",1,"carnivoro","salchicha");
        perro2.alimentacion();
        
        Animal gato1 = new Gato("pelusa",15,"galletas","Siames");
        gato1.alimentacion();
        
        Animal caballo1 = new Caballo("Spark",25,"Pasto","Fino");
        caballo1.alimentacion();
        
    }
    
}
