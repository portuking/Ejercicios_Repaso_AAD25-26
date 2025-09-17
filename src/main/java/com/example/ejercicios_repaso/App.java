package com.example.ejercicios_repaso;

import java.util.LinkedList;
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
        sc.nextLine();
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

    public static void listaReversa(){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Manuel");
        lista.add("Manuel");
        lista.add("Manuel");
        lista.add("Iván");
        lista.add("Jorge");
        lista.add("Mario");
        lista.add("Pablo");
        lista.add("Roi");
        lista.add("Miriam");
        lista.add("Francisco");
        lista.add("David");
        lista.add("Lois");
        lista.add("José");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }

    public static LinkedList<String> crearLista(){
        LinkedList<String> list = new LinkedList<>();
        boolean exit = false;
        do{
            System.out.print("Escribe un nombre: ");
            String nombre = sc.nextLine();
            if(nombre.isEmpty()){
                exit = true;
            }else{
                list.add(nombre);
            }
        }while(!exit);
        return list;
    }

    public static void imprimirLista(LinkedList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void main( String[] args ) {
        matrizEnteros();
        sumarMatriz(crearMatriz());
        listaReversa();
        imprimirLista(crearLista());
        sc.close();
    }
}
