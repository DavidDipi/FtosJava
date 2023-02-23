package retos;

import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random ramdom = new Random();
        
        int pc = ramdom.nextInt(4-1)+1;
        System.out.println("La compu ya escogio");

        System.out.println("Ingrese su opción: ");
        System.out.println("1: PIEDRA");
        System.out.println("2: PAPEL");
        System.out.println("3: TIJERA");

        int user = lectura.nextInt();

        switch ( pc ){
            case 1:
                System.out.println("La computadora escogio: Piedra");
                switch ( user )
                {
                    case 1: System.out.println("Empate!"); break;
                    case 2: System.out.println("Usted gana!"); break;
                    case 3: System.out.println("La computadora gana!"); break;
                    default:
                        System.out.println("ingrese una opcion correcta");
                    break;
                }
                break;
 
            case 2:
                System.out.println("La computadora escogio: Papel");
                switch ( user )
                {
                    case 1: System.out.println("La computadora gana!"); break;
                    case 2: System.out.println("Empate!"); break;
                    case 3: System.out.println("Usted gana!"); break;
                    default:
                        System.out.println("ingrese una opcion correcta");
                     break;
                }
                break;
 
            case 3:
                System.out.println("La computadora escogio: Tijera");
                switch ( user )
                {
                    case 1: System.out.println("Usted gana!"); break;
                    case 2: System.out.println("La computadora gana!"); break;
                    case 3: System.out.println("Empate!"); break;
                        default:
                    System.out.println("ingrese una opcion correcta");
                    break;
                }
                break;

            default:
                System.out.println("ingrese una opcion correcta");
            break;
        }
    }   
}
