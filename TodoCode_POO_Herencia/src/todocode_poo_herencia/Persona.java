package todocode_poo_herencia;

public class Persona {

    int id;
    String Dni;
    String Nombre;
    String Apellido;
    String Domicilio;
    String Telefono;

    public Persona() {
    }

    public Persona(int id, String Dni, String Nombre, String Apellido, String Domicilio, String Telefono) {
        this.id = id;
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    

}
