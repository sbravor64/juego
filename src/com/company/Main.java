package com.company;

public class Main {

    public static void main(String[] args) {

        // Mensaje de Binvenida
        Instrucciones instrucciones = new Instrucciones();
        instrucciones.mostrar();

        // creación de Jugador de jugadores
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        jugador1.ponerNombre();
        jugador2.ponerNombre();


        // Creación del dibujo (casillas) para el juego
        Tablero tableroJugador1 = new Tablero();
        Tablero tableroJugador2 = new Tablero();

        tableroJugador1.crear();
        tableroJugador2.crear();


        // Contar numero de Barcos
        tableroJugador1.contarBarcos();
        tableroJugador2.contarBarcos();

        //Comienza el juego
        while(true) {
            jugador1.mostrarTurno();

            tableroJugador2.pedirPosicionAtaque();
            tableroJugador2.mostrarX();
            jugador1.introducirPosicionAtaque();

            tableroJugador2.recorrido();



            jugador2.mostrarTurno();
            tableroJugador1.recorrido();
        }

    }
}
