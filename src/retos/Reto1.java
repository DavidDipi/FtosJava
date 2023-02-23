package retos;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");

        int fahrenheit;
        fahrenheit = lectura.nextInt();

        double celcius = (fahrenheit - 32) / 1.8;

        System.out.println("La temperatura en grados celcius es: " + celcius + "C°");

        lectura.close();
    }
}
