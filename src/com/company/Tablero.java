package com.company;

import java.util.Random;
import java.util.Scanner;

class Tablero {
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    int[][] casillas = new int[3][3];
    String[][] casillasX = new String[3][3];  //se usa para comprobar y tal y cual

    int numeroBarcos;
    int puntos;

     void crear(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                casillas[i][j] = random.nextInt(2);
                casillasX[i][j]="*";
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

    void mostrarX(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(casillasX[i][j]);
            }
            System.out.println();
        }
    }

    void pedirPosicionAtaque(){
        System.out.println("Dime la posición que quieres atacar?");
    }



    void recorrido(){


        while(f<=3 && c<=3) {
           f=f-1;
           c=c-1;
             if(casillas[f][c]==1){
                 if(casillasX[f][c]=="B"){
                     System.out.println("ESTE BARCO YA LO HAS ENCONTRADO");
                     mostrarX();
                 } else{
                     System.out.println("HAS ENCONTRADO UN BARCO!");
                     puntos++;

                     for (int i = 0; i <3 ; i++) {
                         for (int j = 0; j <3 ; j++) {
                             if(f==i && c==j){
                                 casillasX[i][j]="B";
                                 System.out.print(casillasX[i][j]);
                             } else{
                                 System.out.print(casillasX[i][j]);
                             }

                         }
                         System.out.println();
                     }
                 }

                 System.out.println("SIGUE BUSCANDO!");

             } else if (casillas[f][c]==0){
                 System.out.println("HAS DADO EN EL AGUA!");
                 for (int i = 0; i <3 ; i++) {
                     for (int j = 0; j <3 ; j++) {
                         if(f==i && c==j){
                             casillas[i][j]=2;
                             casillasX[i][j]="O";
                             System.out.print(casillasX[i][j]);
                         } else{
                             System.out.print(casillasX[i][j]);
                         }

                     }
                     System.out.println();
                 }
                 break;
             } else {
                 System.out.println("RECUERDA QUE 'O' SIGNIFICA AGUA");
                 System.out.println("PIERDES TURNO");
                 break;
             }

             if(numeroBarcos == puntos){
                 System.out.println();
                 System.out.println();
                 System.out.println("---------------");
                 System.out.println("¡¡FELICIDADES!!");
                 System.out.println("HAS GANADO!!");
                 System.exit(0);
             }

            System.out.println();
            System.out.println("¿Dime la posición que quieres atacar?");
            System.out.print("FILA: ");
            f=teclado.nextInt();
            System.out.print("COLUMNA: ");
            c=teclado.nextInt();

         }
     }

}
