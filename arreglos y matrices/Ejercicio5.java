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

public class Ejercicio5 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int[] numeros = new int[12];
            int numeroIngresado;
            
            System.out.println("INGRESO DE 12 NÚMEROS POSITIVOS");
           
            for (int i = 0; i < numeros.length; i++) {
                
                do {
                    System.out.print("Ingrese un número positivo para la posición "
                            + i + ": ");
                    numeroIngresado = entrada.nextInt();
                    
                    if (numeroIngresado <= 0) {
                        System.out.println(
                                "Error: debe ingresar un número mayor que cero.");
                    }
                    
                } while (numeroIngresado <= 0);
                
                numeros[i] = numeroIngresado + i;
            }
            
            System.out.println("\nARREGLO MODIFICADO");
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Posición " + i + ": " + numeros[i]);
            }
        }
    }
}
