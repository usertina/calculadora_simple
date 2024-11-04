import java.util.Scanner;

public class Tinacalculadora {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int seleccion;//declaro variable
        System.out.println("¿Qué operación desea realizar?");//frases que se ven en la consola
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        seleccion = miScanner.nextInt();//elección de la operacion a realizar
        switch (seleccion) {
            case 1://creo un método para la suma
                suma();
                break;
            case 2://creo un método para la resta
                resta();
                break;
            case 3://creo un método para la multiplicación
                multiplicacion();
                break;
            case 4://creo método para la división
                division();

        }
    }
    private static void division() {// Método de división
        Scanner miScanner = new Scanner(System.in);
        System.out.println("dividir");
        try {// Comienzo de excepción
            System.out.println("¿Cuál es el numerador?");
            float num1 = miScanner.nextFloat();//num1 se inicializa
            System.out.println("¿Cuál es el divisor?");
            float num2 = miScanner.nextFloat();//num2 se inicializa
            while (num2 == 0) {// Cuando el divisor es 0
                System.out.println("No se puede dividir entre 0");
                System.out.println("¿Cuál es el divisor?");
                num2 = miScanner.nextFloat();
            }
            float resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } catch (Exception ae) {// Fin de la excepción

        }
    }

    private static void multiplicacion() {// Método de multiplicación
        Scanner miScanner = new Scanner(System.in);
        System.out.println("multiplicar");
        System.out.println("¿Cuál es el primer número?");
        float num1 = miScanner.nextFloat();
        System.out.println("¿Cuál es es segundo número?");
        float num2 = miScanner.nextFloat();
        float resultado = num1 * num2;
        System.out.println("El resultado es: " + resultado);
    }

    private static void resta() {// Método de resta
        Scanner miScanner = new Scanner(System.in);
        System.out.println("restar");
        System.out.println("¿Cuál es el primer número?");
        float num1 = miScanner.nextFloat();
        System.out.println("¿Cuál es es segundo número?");
        float num2 = miScanner.nextFloat();
        float resultado = num1 - num2;
        System.out.println("El resultado es: " + resultado);
    }

    private static void suma() {// Método de suma
        Scanner miScanner = new Scanner(System.in);
        System.out.println("sumar");
        System.out.println("¿Cuál es el primer número?");
        float num1 = miScanner.nextFloat();
        System.out.println("¿Cuál es es segundo número?");
        float num2 = miScanner.nextFloat();
        float resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }

}






