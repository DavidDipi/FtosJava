package retos;

import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int apostar, intentos, dinero;

        apostar = 0;

        System.out.println("¿Ingrese la cantidad de veces desea jugar?: ");
        intentos = lectura.nextInt();

        for(int x = 1; x <= intentos; x++){
            System.out.println("¿Cuanto desea apostar en esta ronda?:");
            dinero = lectura.nextInt();
        }

        lectura.close();
    }
}
