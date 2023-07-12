/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Mundo {
    
    private Pais mercosur;
    private Pais unionEuropea;
    private int año;

    @Override
    public String toString() {
        return "Mundo{" + "mercosur=" + mercosur + ", unionEuropea=" + unionEuropea + ", a\u00f1o=" + año + '}';
    }
    
    

    public Mundo() {
    }

    public Mundo(Pais mercosur, Pais unionEuropea, int año) {
        this.mercosur = mercosur;
        this.unionEuropea = unionEuropea;
        this.año = año;
    }

    public Pais getMercosur() {
        return mercosur;
    }

    public void setMercosur(Pais mercosur) {
        this.mercosur = mercosur;
    }

    public Pais getUnionEuropea() {
        return unionEuropea;
    }

    public void setUnionEuropea(Pais unionEuropea) {
        this.unionEuropea = unionEuropea;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    
}
