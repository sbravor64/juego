package com.company;

import java.util.Scanner;

class Jugador {
    Scanner teclado = new Scanner(System.in);
    String nick;

    void ponerNombre(){
        Scanner tec = new Scanner(System.in);
        System.out.print("NICK PARA JUGADOR: ");
        nick = tec.nextLine();
    }

    void mostrarTurno(){
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.print("¿"+nick+", ");
    }

    void introducirPosicionAtaque(){
        System.out.print("FILA: ");
        int f=teclado.nextInt();
        System.out.print("COLUMNA: ");
        int c=teclado.nextInt();
    }

}