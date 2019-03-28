package microchip;

public class Empleado {
    protected String nombre;
    protected String cedula;
    protected int edad;
    protected boolean casado;
    protected double salario;
    protected String clasificacion;

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
        this.Clasificacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void Clasificacion() {
        if (this.getEdad() <= 21) {
            this.setClasificacion("Principiante");
        } else if (this.getEdad() >= 22 && this.getEdad() <= 35) {
            this.setClasificacion("Intermedio");
        } else if (this.getEdad() > 35) {
            this.setClasificacion("Senior");
        }
    }

    /*protected String nombre;
    protected String cedula;
    protected int edad;
    protected boolean casado;
    protected double salario;
    protected String clasificacion;*/

    public void ImprimirDatos() {
        System.out.println("--------Datos del empleado-------");
        System.out.println("Nombre: " + this.getNombre() + "\n");
        System.out.println("Cedula: " + this.getCedula() + "\n");
        System.out.println("Edad: " + this.getEdad() + "\n");
        if (this.isCasado()) {
            System.out.println("Casado\n");
        } else {
            System.out.println("Soltero\n");
        }
        System.out.println("Salario: " + this.getSalario() + '\n');
        System.out.println("Nivel: " + this.getClasificacion() + "\n");
    }

    public void AumentarSalario(int porcentaje) {
        double aumento = (this.getSalario() * porcentaje) / 100;
        this.salario += aumento;
    }



}
