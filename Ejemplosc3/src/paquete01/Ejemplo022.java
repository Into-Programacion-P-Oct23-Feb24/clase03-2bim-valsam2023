/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        Scanner entrada = new Scanner(System.in);
        // forma 1
        int[][] arreglo1 = new int[3][4]; //
        int valor;
        System.out.printf("Uso de la opción length: %d\n",
                arreglo1.length);

        System.out.printf("Valor en la posición [0][2]\n", arreglo1[0][2]);

        arreglo1[0][2] = 1000;

        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1.length; c++) {
                System.out.printf("Ingrese un numero en la posicion [%d]"
                        + "[%d]\n", f, c);
                valor = entrada.nextInt();
                if (valor % 2 == 0 && valor >= 10){
                    valor = 0;
                }
                arreglo1[f][c] = valor;
            }
        }

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                System.out.printf("fila[%d] columna[%d] = %d\n",
                        fila, col, arreglo1[fila][col]);
            }
        }

    }

}
