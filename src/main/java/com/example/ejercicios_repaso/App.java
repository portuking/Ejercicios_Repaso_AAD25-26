package com.example.ejercicios_repaso;

/**
 * Hello world!
 *
 */
public class App {

    public static void matrizEnteros() {
        int suma = 0;
        int[][] matriz = {
            {1, 4, 7},
            {2, 5, 10},
            {6, 3, 9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println(suma);
            suma = 0;
        }
        System.out.println();
    }
    

    public static void main( String[] args ) {
        matrizEnteros();
    }
}
