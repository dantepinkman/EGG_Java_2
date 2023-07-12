
package egg_guia_12_ej_04;

import Entidades.CalculosFormas;
import Entidades.Circulo;
import Entidades.Rectangulo;

public class EGG_Guia_12_Ej_04 {

    public static void main(String[] args) {
       
        CalculosFormas cf = new Circulo(0, 0);
        CalculosFormas cf1 = new Rectangulo(0, 0);
        cf.perimetro();
        cf.area();
        cf1.perimetro();
        cf1.area();
        
    }
    
}
