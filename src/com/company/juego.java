package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class juego {
    public static void game(){
        Scanner tec = new Scanner(System.in);
        System.out.println("¿DE CUENTO QUIERES QUE SEA EL TABLERO DEL JUEGO?");
        System.out.print("COLUMNAS: ");
        int columnas=tec.nextInt();
        System.out.print("FILAS: ");
        int filas=tec.nextInt();

        int[][] tablero = new int[columnas][filas];

        for (int i = 0; i <columnas ; i++) {
            for (int j = 0; j <filas ; j++) {
                Random r = new Random();
                tablero[i][j]=r.nextInt(2);
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }
}
