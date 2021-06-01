package com.codebind;

import java.time.chrono.ThaiBuddhistEra;

public class Caballos extends Thread {

    String nombre;

    public Caballos(String algo) {
        this.nombre = algo;
    }

    public void run() {

        int porcentaje = 1;
        int numAleatorio;
        try{
            while (porcentaje < 100) {
                numAleatorio = generaNumeroAleatorio(1, 15);
                System.out.println("\nEl caballo " + this.nombre + " ha aumentado en " + numAleatorio);
                porcentaje += numAleatorio;
                if(porcentaje >= 100)
                    System.out.println("\nEl caballo " + this.nombre + " ha ganado la carrera");

                Thread.sleep(500);
            }
        }catch (InterruptedException ex){
            ex.fillInStackTrace();
        }

    }

    public static int generaNumeroAleatorio ( int minimo, int maximo){
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}
