package com.example.ejercicios_repaso;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

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

    public static int[][] crearMatriz(){
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Escriba un número: ");
                int num = sc.nextInt();
                matriz[i][j] = num;
            }
        }
        return matriz;
    }

    public static void sumarMatriz(int[][] matriz){
        int suma = 0;
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
        sumarMatriz(crearMatriz());
    }
}
