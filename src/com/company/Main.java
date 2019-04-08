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

            if(tableroJugador1.hundidos<tableroJugador1.numeroBarcos){
                do {
                    tableroJugador2.mostrarTablero();

                    jugador1.introducirPosicionAtaque();

                    tableroJugador2.comprobarCasilla(jugador1);

                    tableroJugador2.comprobarTodosHundidos();

                } while(tableroJugador2.casillas[jugador1.fila][jugador1.columna]==3);
            } else {
                return;
            }

            // if (tablero2 NO estaban todos hundidos)

            if(tableroJugador2.hundidos<tableroJugador2.numeroBarcos){
                do {
                    tableroJugador1.mostrarTablero();

                    jugador2.introducirPosicionAtaque();

                    tableroJugador1.comprobarCasilla(jugador2);

                    tableroJugador1.comprobarTodosHundidos();

                } while(tableroJugador1.casillas[jugador2.fila][jugador2.columna]==3);
            } else {
                return;
            }


        }

    }
}


/*
LLAMAR METODO:     pasar variables:    metodo(variable)            recibir:   void metodo(int variable)



 */
