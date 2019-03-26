package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creación de Nick de jugadores
        Nick nick_jug_1= new Nick();
        Nick nick_jug_2= new Nick();

        nick_jug_1.nombre();
        nick_jug_2.nombre();


        // Creación del dibujo para empezar a jugar
        draw draw_jug1 = new draw();
        draw draw_jug2 = new draw();

        draw_jug1.tablero();
        System.out.println();
        draw_jug2.tablero();

        //Creación de los tableros de comprobación
        draw_jug1.tableroC();
        draw_jug2.tableroC();

        // Contar numeros de Barcos
        draw_jug1.contadorBarcos();
        draw_jug2.contadorBarcos();


        // Comienzo de juego
        //while(draw_jug1.conttablero>draw_jug1.puntos_jug){
        //    draw_jug1.tableroC();
        //    nick_jug_1.nickJ();
        //    draw_jug2.recorrido();
        //    draw_jug2.tableroC();
        //    nick_jug_2.nickJ();
        //    draw_jug1.recorrido();
        //}

        //Comienza el juego
        nick_jug_1.nickJ();
        draw_jug2.recorrido();


    }
}
