package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Nick nick_jug_1= new Nick();
        Nick nick_jug_2= new Nick();

        nick_jug_1.nombre();
        nick_jug_2.nombre();


        draw draw_jug1 = new draw();
        draw draw_jug2 = new draw();

        draw_jug1.tablero();
        System.out.println();
        draw_jug2.tablero();

        nick_jug_1.nickJ();
        draw_jug2.recorridoN1();
        nick_jug_2.nickJ();
        draw_jug1.recorridoN2();


    }
}
