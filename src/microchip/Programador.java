package microchip;

public class Programador extends Empleado {
    public int lineasCodigo;
    public String lenguajeDominante;

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasCodigo,
                       String lenguajeDominante) {

        super(nombre, cedula, edad, casado, salario);
        this.lineasCodigo = lineasCodigo;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasCodigo() {
        return lineasCodigo;
    }

    public void setLineasCodigo(int lineasCodigo) {
        this.lineasCodigo = lineasCodigo;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
}
