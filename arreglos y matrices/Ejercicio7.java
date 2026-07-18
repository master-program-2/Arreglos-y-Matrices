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

public class Ejercicio7 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int[][] matriz = new int[4][4];
            int sumaTotal = 0;
            
            System.out.println("INGRESO DE DATOS DE LA MATRIZ 4 x 4");
            
            for (int fila = 0; fila < 4; fila++) {
                
                for (int columna = 0; columna < 4; columna++) {
                    
                    System.out.print("Ingrese el valor de la posición ["
                            + fila + "][" + columna + "]: ");
                    
                    matriz[fila][columna] = entrada.nextInt();
                   
                    sumaTotal = sumaTotal + matriz[fila][columna];
                }
            }
            
            System.out.println("\nMATRIZ INGRESADA");
            
            for (int fila = 0; fila < 4; fila++) {
                
                for (int columna = 0; columna < 4; columna++) {
                    System.out.print(matriz[fila][columna] + "\t");
                }
                
                System.out.println();
            }
            
            System.out.println("\nSuma total de los elementos: " + sumaTotal);
        }
    }
}