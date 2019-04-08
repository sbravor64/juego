package com.company;

import java.util.Random;
import java.util.Scanner;

class Tablero {
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    int[][] casillas = new int[3][3];   // 0 vacia   1 barco    2  agua    3 hundido

    int numeroBarcos;
    int hundidos;
    int f,c;

     void crear(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                casillas[i][j] = random.nextInt(2);
            }
        }
    }

    void contarBarcos(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(casillas[i][j]==1){
                    numeroBarcos++;
                }
            }
        }
    }


    void mostrarTablero(){
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(casillas[i][j] == 0){
                    System.out.print("*");
                } else if(casillas[i][j] == 1){
                    System.out.print("*");
                } else if(casillas[i][j] == 2){
                    System.out.print("O");
                } else if(casillas[i][j] == 3){
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }

    void comprobarCasilla(Jugador jugador) {
        if(casillas[jugador.fila][jugador.columna] == 0){
            System.out.println("\033[34mHas dado en el Agua\033[0m");
            System.out.println("Perdes Turno");
            casillas[jugador.fila][jugador.columna] = 2;

        }
        else if(casillas[jugador.fila][jugador.columna] == 1){
            System.out.println("\u001B[31mHas hundido un Barco\033[0m");
            System.out.println("Sigue Intentándolo");
            casillas[jugador.fila][jugador.columna] = 3;
            hundidos++;
        }
        else if(casillas[jugador.fila][jugador.columna] == 2){
            System.out.println("Recuerda que 'O' significa Agua");
            System.out.println("Pierdes Turno");
        }
        else if(casillas[jugador.fila][jugador.columna] == 3){
            System.out.println("Ya has encontrado un Barco en esta posición");
            System.out.println("Vuelve a intentarlo");
        }
    }



    void comprobarTodosHundidos(){
        if(numeroBarcos == hundidos){
            System.out.println();
            System.out.println();
            System.out.println("---------------");
            System.out.println("¡¡FELICIDADES!!");
            System.out.println("HAS GANADO!!");
        }
    }
}
