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

public class Ejercicio2 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            double[] numeros = new double[10];
            double suma = 0;
            double promedio;
            
            System.out.println("INGRESO DE 10 NÚMEROS REALES");
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el número de la posición " + i + ": ");
                numeros[i] = entrada.nextDouble();
                
                suma = suma + numeros[i];
            }
            
            promedio = suma / numeros.length;
            
            System.out.println("\nRESULTADOS");
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}
