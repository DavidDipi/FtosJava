package retos;

import java.util.Scanner;

public class Reto11 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int c, ganador;

        System.out.println("Ingrese el número de competidores: ");
        c = lectura.nextInt();
        
        String[] nombre = new String[c];
        double[] tiempos = new double[c];

        for(int i = 0; i < c; i++){
            System.out.println("Ingrese el nombre del competidor " + (i + 1) + ": ");
            nombre[i] = lectura.next();

            System.out.println("Ingrese el tiempo del competidor " + (i + 1) + ": ");
            tiempos[i] = lectura.nextDouble();

        }

        System.out.println("Nombres y tiempos");
        for(int i = 0; i < c; i++){
            System.out.println(nombre[i] + ", tiempo: " + tiempos[i]);
        }

        //Buscar el ganador
        ganador = 0;
        double tiempoGanador = tiempos[0];
        for( int i = 1; i < c; i++){
            if ( tiempos[i] < tiempoGanador ){
                tiempoGanador = tiempos[i];
                ganador = i;
            }
        }
        
        System.out.println("El ganador es " + nombre[ganador] + " con un tiempo de " + tiempos[ganador]);
        
        lectura.close();
    }
}
