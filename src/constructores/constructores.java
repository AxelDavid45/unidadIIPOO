package constructores;

import java.util.Scanner;

public class constructores {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        String name;
        int cal = 0, acum = 0, promedio = 0;
        int n, matricula;
        System.out.println("Ingresa el nombre del alumno: ");
        name = entrada.nextLine();
        System.out.println("Numero de calificaciones del alumno: ");
        n = entrada.nextInt();
        System.out.println("Ingresa la matricula: ");
        matricula = entrada.nextInt();
        for(int i = 0; i < n; i ++) {
            System.out.println("Ingresa la calificacion: ");
            cal = entrada.nextInt();
            acum += cal;
        }
        promedio = acum/n;
        if(promedio >= 8) {
            Alumnos alumno = new Alumnos(name, true, promedio);
            alumno.setMatricula(matricula);
        } else {
            Alumnos alumno = new Alumnos(name, false);
            alumno.setMatricula(matricula);
        }



    }
}


