package retos;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int months, weight;

        System.out.println("Ingresa los meses del bebé: ");
        months = lectura.nextInt();

        System.out.println("Ingresa el peso del bebé: ");
        weight = lectura.nextInt();

        int dose;
        dose = ( weight + 10 / months * 10 ) * 8;

        System.out.println("La dosis de la vacuna es de: " + dose );
     
        
        lectura.close();
    }
}
