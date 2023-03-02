package ejercicios;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int i;
    
        float note, acumulador, average, counter;

        acumulador = 0;
        counter = 0;

        for( i = 1 ; i <= 4 ; i++){
            System.out.println("Ingrese el valor de la " + i + " nota");
            note = lectura.nextFloat();

            acumulador = acumulador + note;
            counter++;
        }

        average = acumulador / counter;

        if( average <= 2.9 ){
            System.out.println("Su promedio es de: " + average + ", reprobaste la asignatuta");
        }else if( average >= 3.0 && average <= 4.0 ){
            System.out.println("Su promedio es de: " + average + ", pasaste la asignatura raspando");
        }else if( average > 4.0 && average <= 5.0 ){
            System.out.println("Su promedio es de: " + average + ", aprobaste con buenos resultados");
        }else{
            System.out.println("La nota de " + average + ", es mayor que 5 o menor que 0, ingrese datos correctos");
        }

        lectura.close();

    }
}
