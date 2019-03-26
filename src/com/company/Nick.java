package com.company;
import java.util.Random;
import java.util.Scanner;

class Nick {
    String nick;

    void nombre(){
        Scanner tec = new Scanner(System.in);
        System.out.print("NICK PARA JUGADOR: ");
        nick=tec.nextLine();
    }

    void nickJ(){
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.print("¿"+nick+", ");
    }

}
