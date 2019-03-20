package com.company;
import java.util.Random;

 class draw {
     int[][] tablero = new int[5][5];
     int f;
     int c;
     int puntos_jug1=0;
     int puntos_jug2=0;


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

    void recorrido(){
         if(f<5 && c<5){
             if(tablero[1-f][1-c]==1){
                 System.out.println("HAS ENCONTRADO UNA PARTE DE UN BARCO!");
                 System.out.println("SIGUE BUSCANDO!");
                 puntos_jug1++;
             } else if (tablero[1-f][1-c]==0){
                 System.out.println("HAS DADO EN EL AGUA!");
             }
         }
     }

}
