package ejemplo2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        String matricula, nombre;
        double c1,c2,c3;
        int tam = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo");
        tam = entrada.nextInt();
        Alumnos estudiantes[] = new Alumnos[tam];

        for(int i = 0; i<estudiantes.length; i++) {
            System.out.println("Ingrese la matricula");
        }
    }
}
