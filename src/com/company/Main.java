package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Nick nick_jug_1= new Nick();
        Nick nick_jug_2= new Nick();


        draw draw_jug1 = new draw();
        draw draw_jug2 = new draw();

        draw_jug1.tablero();
        System.out.println();
        draw_jug2.tablero();


        draw_jug2.recorrido();

    }
}
