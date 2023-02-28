package retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

            int valor, x, cantidad, i, precio, cantidadP, descuento, precioD;
            Object resultado;

            System.out.println("Digite la cantidad de productos: ");
            cantidad = lectura.nextInt();

            valor = 0;

            for(i = 1; i <= cantidad; i++){
                System.out.println("Ingrese el precio del producto #" + i + ":");
                precio = lectura.nextInt();

                System.out.println("Ingrese la cantidad del producto #" + i + ":");
                cantidadP = lectura.nextInt();

                valor += precio * cantidadP;
            }

            System.out.println("El total a pagar es: " + valor);

            if(valor >= 50000){

                System.out.println("Usted ha sido beneficiado de un descuento por compras mayores a $50.000");

                ArrayList<String> bolitas = new ArrayList<String>();

                bolitas.add("rojo");
                bolitas.add("amarillo");
                bolitas.add("azul");
                bolitas.add("blanco");

                //System.out.println(bolitas);

                x = (int) (Math.random() * 4);

                resultado = bolitas.get(x);

                System.out.println("Valor obtenido: " + resultado);

                if(resultado == "rojo"){

                    descuento = (int) ((int) valor * 0.1);
                    precioD = (valor - descuento);
                    System.err.println("Has obtenido el descuento del 10% sobre el valor de tu compra, el valor total con descuento es de: " + precioD);

                }else if(resultado == "amarillo"){

                    descuento = (int) ((int) valor * 0.5);
                    precioD = (valor - descuento);
                    System.err.println("Has obtenido el descuento del 50% sobre el valor de tu compra, el valor total con descuento es de: " + precioD);

                }else if(resultado == "azul"){

                    descuento = (int) ((int) valor * 0.3);
                    precioD = (valor - descuento);
                    System.err.println("Has obtenido el descuento del 30% sobre el valor de tu compra, el valor total con descuento es de: " + precioD);

                }else if(resultado == "blanco"){

                    System.err.println("Has obtenido tu compra gratis");

                }else{
                    System.out.println("Ha ocurrido un error inesperado");
                }

            }else{
                System.out.println("El valor de la compra es inferior de $50.000, no aplicas para los descuentos");
            }

        lectura.close();
    }
}
