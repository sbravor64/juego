package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {

   void juego(){
       Scanner teclado = new Scanner(System.in);

       draw draw_jug1 = new draw();
       draw draw_jug2 = new draw();

       System.out.println();
       System.out.println("¿Dime la posición que quieres atacar?");
       System.out.print("FILA: ");
       draw_jug2.f=teclado.nextInt();
       System.out.print("COLUMNA: ");
       draw_jug2.c=teclado.nextInt();

   }

}
