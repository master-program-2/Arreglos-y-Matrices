/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.y.matrices;

/**
 *
 * @author Jesus menendez 
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

   
        try (Scanner entrada = new Scanner(System.in)) {
   
            int[] numeros = new int[10];
            
            System.out.println("INGRESO DE 10 NÚMEROS ENTEROS");
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el número de la posición " + i + ": ");
                numeros[i] = entrada.nextInt();
            }
            
            System.out.println("\nVALORES ALMACENADOS");
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Posición " + i + ": " + numeros[i]);
            }
        }
    }
}
