/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int valor = 0;

        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo.length; c++) {
                if (f==c){
                    valor += arreglo[f][c];
                }
            }
        }
        System.out.printf("%d\n", valor);
    }
}

/*
Lo que hice fue primero declarar el arreglo con los valores de la tabla, declaro 
una variable llamada valor acumuladora inicializada en cero, hago dos ciclos for
para las filas y para las columnas, hago un if diciendole que si el valor de 
filas es igual al de columnas se sumen, entonces como estan el posicion 
[0,0][1,1]y[2,2], la caracteristica que tienen es que sus filas y columnas se 
parecen, luego imprimo la suma con un printf.
*/