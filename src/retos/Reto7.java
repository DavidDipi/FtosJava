package retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int valor, x;
        Object resultado;

        System.out.println("Ingrese el valor de la compra");
        valor = lectura.nextInt();

        if(valor >= 50000){

            ArrayList bolitas = new ArrayList<>();

            bolitas.add("rojo");
            bolitas.add("amarillo");
            bolitas.add("azul");
            bolitas.add("blanco");

            System.out.println(bolitas);

            x = (int) (Math.random() * 3);

            resultado = bolitas.get(x);

            System.out.println("Valor elegido: " + resultado);

            if(resultado == "rojo"){

                System.out.println("Ha salido: " + resultado);
                System.err.println("Has obtenido el descuento del 10% sobre el valor de tu compra");

            }else if(resultado == "amarillo"){

                System.out.println("Ha salido: " + resultado);
                System.err.println("Has obtenido el descuento del 50% sobre el valor de tu compra");

            }else if(resultado == "azul"){

                System.out.println("Ha salido: " + resultado);
                System.err.println("Has obtenido el descuento del 30% sobre el valor de tu compra");

            }else if(resultado == "blanco"){

                System.out.println("Ha salido: " + resultado);
                System.err.println("Has obtenido tu compra gratis");

            }else{
                System.out.println("Ha ocurrido un error inesperado");
            }


        }else{
            System.out.println("El valor de la compra es inferior de $50.000");
        }

        lectura.close();
    }
}
