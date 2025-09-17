package com.example.ejercicios_repaso;

import java.util.LinkedList;
import java.util.Scanner;

public class GestorMensajes {
    public LinkedList<String> almacenMensajes;
    Scanner sc = new Scanner(System.in);

    public GestorMensajes(){
        this.almacenMensajes = new LinkedList<>();
    }

    public void anhadirMensaje(){
        boolean exit = false;
        do{
            System.out.print("Escriba aqui su mensaje: ");
            String mensaje = this.sc.nextLine();
            if(mensaje.isEmpty()){
                exit = true;
            }else{
                this.almacenMensajes.add(mensaje);
            }
        }while(!exit);
        this.sc.close();
    }

    public void listarMensajes(){
        for (String string : almacenMensajes) {
            System.out.println(string);
        }
    }
}
