package herencia;

public class Persona {
    String nombre;
    int edad;
    double estatura;

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public void caminar() {
        System.out.println("I'm walking");
    }



}
