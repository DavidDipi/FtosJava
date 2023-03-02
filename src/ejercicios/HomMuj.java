package ejercicios;

import java.util.Scanner;

public class HomMuj {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
            int contadorH, contadorM, x, select, nPeople;

            contadorH = 0;
            contadorM = 0;

            System.out.println("Ingrese la cantidad de personas en el grupo");
            nPeople = lectura.nextInt();

            for( x = 1; x <= nPeople; x++ ){
                
                System.out.println("Ingresa 1 si eres hombre, o 2 si eres mujer: ");
                select = lectura.nextInt();

                if (select == 1){
                    System.out.println("Eres hombre");
                    contadorH++;
                }else if (select == 2){
                    System.out.println("Eres mujer");
                    contadorM++;
                }else{
                    System.out.println("Ingresa un valor correcto");
                }
                
            }

            System.out.println("En total hay: " + contadorH + " hombres, y " + contadorM + " mujeres");
        lectura.close();

    }
}
