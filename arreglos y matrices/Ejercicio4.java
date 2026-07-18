/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.y.matrices;

/**
 *
 * @author jesus menendez 
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Declaración del arreglo
        int[] numeros = new int[20];

        // Declaración de los contadores y acumuladores
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.println("INGRESO DE 20 NÚMEROS ENTEROS");

        // Ingreso y almacenamiento de los números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = entrada.nextInt();

            // Comprobar si el número es par o impar
            if (numeros[i] % 2 == 0) {

                cantidadPares = cantidadPares + 1;
                sumaPares = sumaPares + numeros[i];

            } else {

                cantidadImpares = cantidadImpares + 1;
                sumaImpares = sumaImpares + numeros[i];
            }
        }

        // Presentación de los resultados
        System.out.println("\nRESULTADOS");
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los números impares: " + sumaImpares);

        entrada.close();
    }
}