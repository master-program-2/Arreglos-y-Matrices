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

public class Ejercicio3 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
 
            int[] numeros = new int[15];
            int mayor;
            int menor;
            int posicionMayor = 0;
            int posicionMenor = 0;
            
            System.out.println("INGRESO DE 15 NÚMEROS ENTEROS");
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el número de la posición " + i + ": ");
                numeros[i] = entrada.nextInt();
            }
            
            mayor = numeros[0];
            menor = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                    posicionMayor = i;
                }
                
                if (numeros[i] < menor) {
                    menor = numeros[i];
                    posicionMenor = i;
                }
            }
            
            System.out.println("\nRESULTADOS");
            System.out.println("Número mayor: " + mayor);
            System.out.println("Posición del número mayor: " + posicionMayor);
            System.out.println("Número menor: " + menor);
            System.out.println("Posición del número menor: " + posicionMenor);
        }
    }
}
