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

public class Ejercicio9 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
 
            int[][] matriz = new int[5][5];
            
            int mayor;
            int menor;
            
            System.out.println("INGRESO DE DATOS DE LA MATRIZ 5 x 5");
            

            for (int fila = 0; fila < 5; fila++) {
                
                for (int columna = 0; columna < 5; columna++) {
                    
                    System.out.print("Ingrese el valor de la posición ["
                            + fila + "][" + columna + "]: ");
                    
                    matriz[fila][columna] = entrada.nextInt();
                }
            }
            
            mayor = matriz[0][0];
            menor = matriz[0][0];
            
            for (int fila = 0; fila < 5; fila++) {
                
                for (int columna = 0; columna < 5; columna++) {
                    
                    if (matriz[fila][columna] > mayor) {
                        mayor = matriz[fila][columna];
                    }
                    
                    if (matriz[fila][columna] < menor) {
                        menor = matriz[fila][columna];
                    }
                }
            }
            
            System.out.println("\nRESULTADOS");
            System.out.println("Mayor valor: " + mayor);
            System.out.println("Menor valor: " + menor);
        }
    }
}