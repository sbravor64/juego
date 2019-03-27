package com.company;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

class draw {
    Scanner teclado = new Scanner(System.in);
    int[][] tablero = new int[3][3];
    String[][] tableroC = new String[3][3];
    int conttablero;
    int puntos_jug;

     void tablero(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                Random r = new Random();
                tablero[i][j]=r.nextInt(2);
            }
        }
    }

    void tableroC(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                tableroC[i][j]="*";
            }
        }
    }

    void contadorBarcos(){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(tablero[i][j]==1){
                    conttablero++;
                }
            }
        }
    }

    void recorrido(){
        System.out.println("Dime la posición que quieres atacar?");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(tableroC[i][j]);
            }
            System.out.println();
        }
        System.out.print("FILA: ");
        int f=teclado.nextInt();
        System.out.print("COLUMNA: ");
        int c=teclado.nextInt();


        while(f<=3 && c<=3) {
           f=f-1;
           c=c-1;
             if(tablero[f][c]==1){
                 if(tableroC[f][c]=="B"){
                     System.out.println("ESTE BARCO YA LO HAS ENCONTRADO");
                     for (int i = 0; i <3 ; i++) {
                         for (int j = 0; j <3 ; j++) {
                             System.out.print(tableroC[i][j]);
                         }
                         System.out.println();
                     }
                 } else{
                     System.out.println("HAS ENCONTRADO UN BARCO!");
                     puntos_jug++;

                     for (int i = 0; i <3 ; i++) {
                         for (int j = 0; j <3 ; j++) {
                             if(f==i && c==j){
                                 tableroC[i][j]="B";
                                 System.out.print(tableroC[i][j]);
                             } else{
                                 System.out.print(tableroC[i][j]);
                             }

                         }
                         System.out.println();
                     }
                 }

                 System.out.println("SIGUE BUSCANDO!");

             } else if (tablero[f][c]==0){
                 System.out.println("HAS DADO EN EL AGUA!");
                 for (int i = 0; i <3 ; i++) {
                     for (int j = 0; j <3 ; j++) {
                         if(f==i && c==j){
                             tablero[i][j]=2;
                             tableroC[i][j]="O";
                             System.out.print(tableroC[i][j]);
                         } else{
                             System.out.print(tableroC[i][j]);
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

             if(conttablero==puntos_jug){
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
