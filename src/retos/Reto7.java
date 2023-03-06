package retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int value, x;
        Object result;

        System.out.println("Ingrese el valor de la compra");
        value = lectura.nextInt();

        if(value >= 50000){

            ArrayList<String> bolitas = new ArrayList<String>();

            bolitas.add("rojo");
            bolitas.add("amarillo");
            bolitas.add("azul");
            bolitas.add("blanco");

            System.out.println(bolitas);

            x = (int) (Math.random() * 4);

            result = bolitas.get(x);

            System.out.println("valor obtenido: " + result);

            if(result == "rojo"){


                System.out.println("Has obtenido el descuento del 10% sobre el valor de tu compra");

            }else if(result == "amarillo"){


                System.out.println("Has obtenido el descuento del 50% sobre el valor de tu compra");

            }else if(result == "azul"){


                System.out.println("Has obtenido el descuento del 30% sobre el valor de tu compra");

            }else if(result == "blanco"){


                System.out.println("Has obtenido tu compra gratis");

            }else{
                System.out.println("Ha ocurrido un error inesperado");
            }


        }else{
            System.out.println("El valor de la compra es inferior de $50.000, no aplicas para los descuentos");
        }

        lectura.close();
    }
}