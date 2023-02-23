package retos;

import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random ramdom = new Random();

        int one, two, start, sum;

        System.out.println("¿Quiere jugar craps?");
        System.out.println("1: SI");
        System.out.println("2: NO");
        start = lectura.nextInt();

        if(start==1){
            one = ramdom.nextInt(7-1)+1;
            two = ramdom.nextInt(7-1)+1;
            sum = one + two;

            System.out.println("El dado uno ha sacado: " + one);
            System.out.println("El dado dos ha sacado: " + two);
            System.out.println("La sumatoria es: " + sum);
            if(one==1 && two == 1 || sum == 3 || sum == 11 || sum == 7 || sum == 12){
                System.out.println("Ganaste el juego: ");
            }else{
                System.out.println("Has perdido");
            }

        }else{
            System.out.println("Juego no iniciado");
        }

        lectura.close();
    }
}
