import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String name;
        name=lectura.nextLine();

        System.out.println("Ingresa un número");

        int numberOne;
        numberOne = lectura.nextInt();

        System.out.println("Ingresa un segundo número");
        int numberTwo;
        numberTwo = lectura.nextInt();

        int addition;
        addition=numberOne+numberTwo;

        System.out.println("¡Hola " + name + "!, ingresaste los números " + numberOne + " y " + numberTwo + " y el resultado de la suma es: " + addition);
        
        lectura.nextLine();//Limpieza de buffer  

        lectura.close();
    
    }
}