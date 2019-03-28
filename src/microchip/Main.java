package microchip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables
        Scanner entrada = new Scanner(System.in);
        int opcionSeleccionada = 0;
        int NElementos = 0;
        int repetir = 1;
        boolean casado;

        System.out.println("BIENVENIDO");
        // Guarda el numero de empleados en el arreglo
        System.out.println("Cuantos empleados deseas guardar?");
        NElementos = entrada.nextInt();
        //Creamos el arreglo de empleados para utilizarlo
        Programador programadores[] = new Programador[NElementos];

        //for each
        for (int i = 0; i < NElementos; i++) {
            //Entrada de datos
            /*protected String nombre;
            protected String cedula;
            protected int edad;
            protected boolean casado;
            protected double salario;
            protected String clasificacion;*/
            entrada.nextLine(); //Limpieza del buffer
            System.out.println("Ingresa el nombre del programador: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingresa la cedula del programador: ");
            String cedula = entrada.nextLine();
            System.out.println("Ingresa su edad: ");
            int edad = entrada.nextInt();
            System.out.println("El programador esta casado?");
            if (entrada.nextLine().equals("Si") || entrada.nextLine().equals("si")) {
                casado = true;
            } else {
                casado = false;
            }
            System.out.println("Ingresa el salario: ");
            double salario = entrada.nextDouble();
            System.out.println("Lineas de codigo por hora: ");
            int lineasH = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Especialidad: ");
            String lenguaje = entrada.nextLine();

            //Creamos el objeto
            programadores[i] = new Programador(nombre, cedula, edad, casado, salario, lineasH, lenguaje);
        }
        do {


        System.out.println("----------OPCIONES ADICIONALES---- ");
        System.out.println("1. VER TODOS LOS EMPLEADOS.");
        System.out.println("2. SUBIR SUELDO A UN EMPLEADO.");
        System.out.println("3. VER DATOS DE UN EMPLEADO");
        System.out.println("4. EXIT");
        opcionSeleccionada = entrada.nextInt();
        switch (opcionSeleccionada) {
            case 1:
                //Nos permite ver datos generales
                System.out.println("----MOSTRANDO TODOS LOS EMPLEADOS.");
                for (int i = 0; i < programadores.length; i++) {
                    System.out.println("ID: " + i + " Nombre: " + programadores[i].getNombre() + " Especialidad: " + programadores[i].getLenguajeDominante());
                }
                break;
            case 2:
                //Aumentar sueldo siempre y sea senior
                System.out.println("--- CAMBIAR SUELDO A UN PROGRAMADOR A SENIOR--");
                //MMuestra a los empleados

                for (int i = 0; i < programadores.length; i++) {
                    System.out.println("ID: " + i + " Nombre: " + programadores[i].getNombre());
                }

                System.out.println("Ingresa el id de empleado al que deseas cambiar el sueldo: ");
                int id = entrada.nextInt();
                //Comprobando que sea senior
                if (programadores[id].getClasificacion().equals("Senior")) {
                    System.out.println("Ingresa el aumento en porcentaje entero: ");
                    int porcentaje = entrada.nextInt();
                    programadores[id].AumentarSalario(porcentaje);
                } else {
                    System.out.println("El programador no esta aprobado para un aumento");
                }
                break;
            case 3: //Muestra los datos de solo un empleado
                ///Imprime los datos
                for (int i = 0; i < programadores.length; i++) {
                    System.out.println("ID: " + i + " Nombre: " + programadores[i].getNombre());
                }

                System.out.println("Ingresa el id del empleado para ver su informacion detallada: ");
                id = entrada.nextInt();
                programadores[id].ImprimirDatos();
                System.out.println("Lineas de codigo por hora: "+ programadores[id].getLineasCodigo());
                System.out.println("Especialidad: "+ programadores[id].getLenguajeDominante());
                break;
            case 4:
                repetir = 0;
                break;
        }
        }while (repetir != 0);
    }


}
