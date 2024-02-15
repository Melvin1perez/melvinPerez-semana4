//Ya no me dio tiempo de hacerlos por separados

//EJERCICIO 1

//package com.mycompany.ejercicio123_melvinalexanderperezramirez;
//import java.util.Scanner;
//public class Ejercicio123_MelvinAlexanderPerezRamirez {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese un año: ");
//        int anio = scanner.nextInt();
//
//        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
//            System.out.println(anio + " es un año bisiesto.");
//        } else {
//            System.out.println(anio + " no es un año bisiesto.");
//        }
//    }
//}

//EJERCICIO 2

//package com.mycompany.ejercicio123_melvinalexanderperezramirez;
//import java.util.Scanner;
//
//public class Ejercicio123_MelvinAlexanderPerezRamirez {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int numero;
//        do {
//            System.out.println("Ingrese un número: ");
//            numero = scanner.nextInt();
//
//            if (numero % 2 == 0) {
//                System.out.println(numero + " es un número par.");
//            } else {
//                System.out.println(numero + " es un número impar.");
//            }
//        } while (numero > 50);
//    }
//}

//EJERCICIO 3

package com.mycompany.ejercicio123_melvinalexanderperezramirez;
import java.util.Scanner;

public class Ejercicio123_MelvinAlexanderPerezRamirez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resultado;
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                System.out.println("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                System.out.println("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case 4:
                System.out.println("Ingrese el dividendo: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el divisor: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("No es posible dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}


