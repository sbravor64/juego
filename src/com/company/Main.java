package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        draw draw_jug1 = new draw();
        draw draw_jug2 = new draw();

        draw_jug1.tablero();
        System.out.println();
        draw_jug2.tablero();


        Game game = new Game();

        game.juego();
        draw_jug2.recorrido();

    }
}
