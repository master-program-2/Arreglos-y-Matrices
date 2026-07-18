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

public class Ejercicio10 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int[][] matriz = new int[3][5];
            int numeroIngresado;
            
            System.out.println("INGRESO DE DATOS DE LA MATRIZ 3 x 5");
            for (int fila = 0; fila < 3; fila++) {
                
                for (int columna = 0; columna < 5; columna++) {
                    
                    System.out.print("Ingrese el valor de la posición ["
                            + fila + "][" + columna + "]: ");
                    
                    numeroIngresado = entrada.nextInt();
                    
                    matriz[fila][columna]
                            = numeroIngresado + (fila * columna);
                }
            }
            
            System.out.println("\nMATRIZ MODIFICADA");
            
            for (int fila = 0; fila < 3; fila++) {
                
                for (int columna = 0; columna < 5; columna++) {
                    
                    System.out.print(matriz[fila][columna] + "\t");
                }
                
                System.out.println();
            }
        }
    }
}