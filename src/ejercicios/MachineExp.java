package ejercicios;

import java.util.Scanner;

public class MachineExp {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String [][] products = {{"Oreo", "Festival", "DeTodito", "Jet"}, {"Burbuja", "Mani", "Ice", "Tostacos"}, {"Gatorade", "Hit", "Postobon", "CocaCola"}};
        int [][] price = new int[4][3];

        for(int f = 0; f <= 3; f++){
            for(int c = 0; c <= 2; c++){
                System.out.println("Ingrese el precio de el producto " + products[f][c]);
                
                System.out.println(products[f][c] + "\t");
            }
        }
    }
}
