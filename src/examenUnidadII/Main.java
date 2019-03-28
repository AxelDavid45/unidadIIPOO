package examenUnidadII;


import java.util.Scanner;

/*
 * Copyright:
 * S2A 14/Marzo/2019
 * Luis Heberto Aguilar Ruiz
 * Axel David Espinosa Meneses
 *
 * */
public class Main {
    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);
//        Cuenta nueva = new Cuenta();
        int opcionSelecc;
        double deposito;
        int retiro;
        String titular;
        Cuenta nueva = new Cuenta();
        int sesion = 1;
        double saldo;
        int numCuenta = 0;
        while (sesion == 1) {
            System.out.println("BIENVENIDO A BANMEX");
            System.out.println("MENU DE OPCIONES: ");
            System.out.println("1. CREAR CUENTA BANCARIA");
            System.out.println("2. DEPOSITAR EFECTIVO.");
            System.out.println("3. RETIRAR EFECTIVO.");
            System.out.println("4. CONSULTAR SALDO");
            System.out.println("5. MODIFICAR CUENTA");
            System.out.println("6. VER DATOS");
            System.out.println("7. EXIT");

            opcionSelecc = entrada.nextInt();
            switch (opcionSelecc) {
                case 1:
                    entrada.nextLine();
                    System.out.println("INGRESA EL NOMBRE DEL CUENTAHABIENTE: ");
                    titular = entrada.nextLine();
                    System.out.println("INGRESA EL SALDO INICIAL, DEBE SER IGUAL O MAYOR A 1000 PESOS");
                    saldo = entrada.nextDouble();
                    while (saldo < 1000.00) {
                        System.out.println("COMPRUEBA QUE EL SALDO SEA MAYOR O IGUAL A 1000 PESOS:");
                        saldo = entrada.nextDouble();
                    }
                    if (saldo >= 1000) {
                        System.out.println("SALDO INCIAL CORRECTO");
                    }
                    System.out.println("INGRESA EL NUMERO DE CUENTA:");
                    numCuenta = entrada.nextInt();
                    entrada.nextDouble();

                    //Creamos el objeto
                    if (saldo >= 6000) {
                        nueva = new Cuenta(titular, numCuenta, saldo, "PREMIUM");
                    } else {
                        //GENERAL
                        nueva = new Cuenta(titular, numCuenta, saldo);
                    }

                    break;
                case 2:
                    System.out.println("INGRESA LA CANTIDAD A DEPOSITAR: ");
                    deposito = entrada.nextDouble();
                    while (deposito <= 0) {
                        System.out.println("COMPRUEBA LA CANTIDAD QUE INTRODUCISTE: ");
                        deposito = entrada.nextDouble();
                    }
                    nueva.deposito(deposito);
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("INGRESA LA CANTIDAD A INGRESAR: ");
                    retiro = entrada.nextInt();
                    while (retiro <= 0) {
                        System.out.println("COMPRUEBA LA CANTIDAD QUE INTRODUCISTE: ");
                        retiro = entrada.nextInt();
                    }
                    double saldoActual = nueva.getSaldoActual();
                    if (retiro > saldoActual) {
                        System.out.println("EL SALDO ES INSUFICIENTE.");
                    } else {
                        System.out.println("TOMA TU DINERO");
                        nueva.retiro(retiro);
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("TU SALDO ACTUAL ES: "+nueva.getSaldoActual());
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("INGRESA EL NUEVO NUMERO DE CUENTA: ");
                    numCuenta = entrada.nextInt();
                    nueva.setNumCuenta(numCuenta);
                    break;
                case 6:
                    System.out.println("\nDATOS DEL USUARIO");
                    double saldoActualCliente = nueva.getSaldoActual();
                    if (saldoActualCliente < 1000) {
                        System.out.println("PROXIMAMENTE TU CUENTA SE CANCELARA POR NO MANTENER SALDO MINIMO ($1000)");
                    }
                    System.out.println("Nombre del titular: " + nueva.getTitular());
                    System.out.println("Numero de cuenta: " + nueva.getNumCuenta());
                    System.out.println("Saldo de cuenta: " + nueva.getSaldoActual());
                    System.out.println("Tipo de cuenta: " + nueva.getTipo());
                    System.out.println("\n");
                    break;
                case 7:
                    sesion = 2;
                    break;
            }
        }
    }
}
