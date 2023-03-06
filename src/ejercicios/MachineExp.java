package ejercicios;

import java.util.Scanner;

public class MachineExp {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String [][] products = new String[4][3];
        
        int [][] price = new int[4][3];

        for(int f = 0; f <= 3; f++){
            for(int c = 0; c <= 2; c++){
                System.out.println("Ingrese el nombre del producto " + f + c);
                products[f][c] = lectura.nextLine();
                System.out.println("Ingrese el precio de el producto " + products[f][c]);
                price[f][c] = lectura.nextInt();
                
                lectura.nextLine();
                
                System.out.println(products[f][c] + "\t");
                System.out.println(price[f][c] + "\t");
            }
        }

        lectura.close();

    }
}
