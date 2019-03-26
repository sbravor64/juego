package com.company;
import java.util.Random;
import java.util.Scanner;

class draw {
    Scanner teclado = new Scanner(System.in);
    int[][] tablero = new int[5][5];
    int conttablero=0;
    int puntos_jug1=0, puntos_jug2=0;


     void tablero(){
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                Random r = new Random();
                tablero[i][j]=r.nextInt(2);
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }

    void contadorBarcos(){
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(tablero[i][j]==1){
                    conttablero++;
                }
            }
        }
    }

    void recorridoN1(){
        System.out.println("Dime la posición que quieres atacar?");
        System.out.print("FILA: ");
        int f=teclado.nextInt();
        System.out.print("COLUMNA: ");
        int c=teclado.nextInt();


       do {
           f=f-1;
           c=c-1;
             if(tablero[f][c]==1){
                 System.out.println("HAS ENCONTRADO UNA PARTE DE UN BARCO!");
                 System.out.println("SIGUE BUSCANDO!");
                 puntos_jug1++;
             } else if (tablero[f][c]==0){
                 System.out.println("HAS DADO EN EL AGUA!");
                 break;
             }

            System.out.println();
            System.out.println("¿Dime la posición que quieres atacar?");
            System.out.print("FILA: ");
            f=teclado.nextInt();
            System.out.print("COLUMNA: ");
            c=teclado.nextInt();

         }  while(f<=5 && c<=5);
     }

    void recorridoN2(){
        System.out.println("Dime la posición que quieres atacar?");
        System.out.print("FILA: ");
        int f=teclado.nextInt();
        System.out.print("COLUMNA: ");
        int c=teclado.nextInt();


        do {
            f=f-1;
            c=c-1;
            if(tablero[f][c]==1){
                System.out.println("HAS ENCONTRADO UNA PARTE DE UN BARCO!");
                System.out.println("SIGUE BUSCANDO!");
                puntos_jug2++;
            } else if (tablero[f][c]==0){
                System.out.println("HAS DADO EN EL AGUA!");
                break;
            }

            System.out.println();
            System.out.println("¿Dime la posición que quieres atacar?");
            System.out.print("FILA: ");
            f=teclado.nextInt();
            System.out.print("COLUMNA: ");
            c=teclado.nextInt();

        }  while(f<=5 && c<=5);
    }

}
