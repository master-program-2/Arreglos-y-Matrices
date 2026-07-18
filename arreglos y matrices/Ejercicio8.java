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

public class Ejercicio8 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
  
            int[][] matriz = new int[4][4];
            int sumaDiagonal = 0;
            
            System.out.println("INGRESO DE DATOS DE LA MATRIZ 4 x 4");
            
            for (int fila = 0; fila < 4; fila++) {
                
                for (int columna = 0; columna < 4; columna++) {
                    
                    System.out.print("Ingrese el valor de la posición ["
                            + fila + "][" + columna + "]: ");
                    
                    matriz[fila][columna] = entrada.nextInt();
                }
            }
            
            System.out.println("\nELEMENTOS DE LA DIAGONAL PRINCIPAL");
            
            for (int i = 0; i < 4; i++) {
                
                System.out.println("Posición [" + i + "][" + i + "]: "
                        + matriz[i][i]);
                
                sumaDiagonal = sumaDiagonal + matriz[i][i];
            }
            
            System.out.println("\nSuma de la diagonal principal: "
                    + sumaDiagonal);
        }
    }
}