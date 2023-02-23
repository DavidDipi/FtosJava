package retos;

import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random ramdom = new Random();

        int cs;

        System.out.println("Ingrese 1 para cara, o 2 para sello");
        cs = lectura.nextInt();

        int x = ramdom.nextInt(3-1)+1;

        switch(x){
            case 1:
                System.out.println("El resultado es cara");
                if(cs==1){
                    System.out.println("Usted gano");
                }else{
                    System.out.println("Ha perdido");
                }
            break;
            case 2:
                System.out.println("El resultado es sello");
                if(cs==2){
                    System.out.println("Usted gano");
                }else{
                    System.out.println("Ha perdido");
                }
            break;
            default:
                System.out.println("Eliga una opcion correcta");
            break;
        }

        lectura.close();
    }
}
