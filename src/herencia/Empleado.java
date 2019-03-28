package herencia;

public class Empleado extends Persona {
    String direccion, funcion;
    double sueldo;

    public Empleado(String nombre, int edad, double estatura, String direccion, double sueldo, String funcion) {
        super(nombre,edad,estatura);
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.funcion = funcion;

    }

    public void trabajar() {
        System.out.println("I'm working with Amim");
    }



}
