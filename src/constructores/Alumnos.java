package constructores;

public class Alumnos {
    private String name;
    private Boolean beca;
    private int matricula;
    private  float promedio;

    public Alumnos(String nombre, Boolean beca) {
        this.name = nombre;
        this.beca = beca;
    }
    public Alumnos(String nombre, Boolean beca, float promedio) {
        this.name = nombre;
        this.beca = beca;
        this.promedio = promedio;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBeca() {
        return beca;
    }

    public void setBeca(Boolean beca) {
        this.beca = beca;
    }


}
