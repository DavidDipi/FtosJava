package ejercicios;

import java.util.Scanner;

public class Presupuesto {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int budget, spein, seguir, count, accumulator; 

        budget = 100000;
        seguir = 1;
        count = 0;
        accumulator = 0;

        while(seguir == 1 && count <=2){

            System.out.println("Digite el gasto");
            spein = lectura.nextInt();

            budget = budget - spein;

            System.out.println("Ha gastado: " + spein + " y su presupuesto es en: " + budget);

            System.out.println("¿Desea continuar?");
            System.out.println("1: SI, 2:NO");
            seguir = lectura.nextInt();

            count++;

            accumulator = accumulator + spein;

            if(count == 3){
                System.out.println("No puede registrar más gastos");
            }
        }

        System.out.println("El gasto total es de; " + accumulator);

        System.out.println("Le han quedado: " + budget);

        lectura.close();

        
    }
}
