package principal;

import logica.Operacion;

import java.util.Scanner;

/**
 * @author Jorge Monzón
 * @project personal-calculadora-java
 */
public class Main {
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Double resultado = 0.0;
        Operacion resultadoOperacion;

        Boolean continuar = true;

        int operacion;

        do {
            System.out.println("**** Aplicación Calculadora ****");
            System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicación
                    4.División
                    5.Salir
                    """);

            System.out.print("Operación a realizar?: ");
            operacion = scanner.nextInt();


            switch (operacion) {
                case 1 -> {
                    resultadoOperacion = proporcionarValores();
                    resultado = resultadoOperacion.suma(resultadoOperacion.getNumero1(), resultadoOperacion.getNumero2());
                    System.out.println("El resultado Suma: " + resultado);
                }
                case 2 -> {
                    resultadoOperacion = proporcionarValores();
                    resultado = resultadoOperacion.resta(resultadoOperacion.getNumero1(), resultadoOperacion.getNumero2());
                    System.out.println("El resultado Resta: " + resultado);
                }
                case 3 -> {
                    resultadoOperacion = proporcionarValores();
                    resultado = resultadoOperacion.multiplicacion(resultadoOperacion.getNumero1(), resultadoOperacion.getNumero2());
                    System.out.println("El resultado Multiplicación: " + resultado);
                }
                case 4 -> {
                    resultadoOperacion = proporcionarValores();
                    resultado = resultadoOperacion.division(resultadoOperacion.getNumero1(), resultadoOperacion.getNumero2());
                    System.out.println("El resultado Division: " + resultado);
                }
                case 5 -> {
                    continuar = false;
                }
                default -> {
                    System.out.println("opción no valida");
                }

            }


        } while (continuar);

        System.out.println("Se finalizo el Programa");


    }

    public static Operacion proporcionarValores() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Proporciona valor operando1: ");
        Double numero1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Proporciona valor operando2: ");
        Double numero2 = scanner.nextDouble();
        scanner.nextLine();

//        Creamos instancias
        Operacion operacion = new Operacion(numero1, numero2);

        return operacion;
    }
}

