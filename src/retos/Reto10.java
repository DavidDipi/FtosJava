package retos;

import java.util.Scanner;

public class Reto10 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int c;

        System.out.println("Ingrese la cantidad de notas: ");
        c = lectura.nextInt();

        float notas[] = new float[c];
        float nota;

        for(int i = 0; i < c; i++){
            System.out.println("Ingrese su nota");
            nota = lectura.nextFloat();
            notas[i] = nota;
        }

        System.out.println("Notas ingresadas:");
        for(int i = 0; i < c; i++){
            System.out.print(notas[i] + ", ");
        }

        float sum = 0;
        for(int i = 0; i < c; i++){
            sum += notas[i];
        }
        float average = sum / c;

        System.out.println("Promedio de notas: " + average);

        if(average < 3){
            System.out.println("Reprobaste");
        } else if(average >= 3 && average <= 4){
            System.out.println("Pasaste Raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }

        lectura.close();
    }
}
