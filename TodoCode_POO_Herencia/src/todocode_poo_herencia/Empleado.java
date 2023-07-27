
package todocode_poo_herencia;

public class Empleado extends Persona{
    int legajo;
    String Cargo;
    Double Sueldo;

    public Empleado(int legajo, String Cargo, Double Sueldo, int id, String Dni, String Nombre, String Apellido, String Domicilio, String Telefono) {
        super(id, Dni, Nombre, Apellido, Domicilio, Telefono);
        this.legajo = legajo;
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
    }

    public Empleado() {
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
}
