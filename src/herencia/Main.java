package herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada  =  new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = entrada.nextLine();
        System.out.println("Write your age: ");
        int age = entrada.nextInt();
        System.out.println("Write your height: ");
        double height = entrada.nextDouble();
        System.out.println("Write your address: ");
        String address = entrada.nextLine();
        System.out.println("Write your salary: ");
        double salary = entrada.nextDouble();
        System.out.println("Write your job title: ");
        String jobTitle = entrada.nextLine();

        Empleado worker = new Empleado(name, age, height, address, salary, jobTitle);
        worker.caminar();
        worker.trabajar();



    }
}
