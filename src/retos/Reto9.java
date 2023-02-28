package retos;

import java.util.Random;
import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random ramdom = new Random();

            int bet, attemps, money, cs, agg, reply;

            bet = 0 ;

            System.out.println("Desea jugar carisellazo; ");
            System.out.println("1: SI, 2: NO");
            reply = lectura.nextInt();
            attemps = 0;

            if(reply == 1){

                System.out.println("Ingrese el dinero a apostar");
                bet = lectura.nextInt();
                
                while(reply == 1 && bet > 0){
                    
                    attemps ++;
                    
                    
                    System.out.println("¿Cuanto desea apostar en esta ronda?:");
                    money = lectura.nextInt();

                    if(money <= bet){

                        System.out.println("Ingrese 1 para cara, o 2 para sello");
                        cs = lectura.nextInt();
                        
                        int x = ramdom.nextInt(3-1)+1;
                        
                        switch(x){
                            case 1:
                            System.out.println("El resultado es cara");
                            if(cs==1){
                                System.out.println("Usted gano");
                                agg = money * 2;
                                bet = bet + agg;
                            }else{
                                System.out.println("Ha perdido");
                                bet = bet - money;
                            }
                            break;
                            case 2:
                            System.out.println("El resultado es sello");
                            if(cs==2){
                                System.out.println("Usted gano");
                                agg = money * 2;
                                bet = bet + agg;
                            }else{
                                System.out.println("Ha perdido");
                                bet = bet - money;
                            }
                            break;
                            default:
                            System.out.println("Eliga una opcion correcta");
                            break;
                        }
                    }else{
                        System.out.println("Dinero insuficiente");
                    }
                
                    System.out.println("Su cuenta es de; " + bet);
                    
                    System.out.println("¿Desea seguir jugando?");
                    System.out.println("1: SI, 2: NO");
                    reply = lectura.nextInt();                
                
                }

                System.out.println("FIN DEL JUEGO");            
                System.out.println("La cantidad de veces que jugo fue de: " + attemps);
                System.out.println("Acumulo un total de: " + bet + " pesos");
            }else{
                System.out.println("Esta bien:c");
            }
            

        lectura.close();
    }
}
