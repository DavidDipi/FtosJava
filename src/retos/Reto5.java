package retos;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String name, lastname;

        System.out.println("Ingrese su nombre: ");
        name = lectura.nextLine();

        System.out.println("Ingrese su apellido: ");
        lastname = lectura.nextLine();

        int lname = name.length();
        int llastname = name.length();

        System.out.println("La longitud de su nombre es: " + lname);
        System.out.println("La longitud de su apellido es: " + llastname);

        String mayusn = name.toUpperCase();
        String minusl = lastname.toLowerCase();

        System.out.println("Tu nombre en mayusculas es: " + mayusn);
        System.out.println("Tu apellido en minusculas es: " + minusl);

        String namec = (name + " " + lastname);

        System.out.println("Tu nombre completo es: " + namec);

        String iniN = name.substring(0, 2);
        String nameLastname = iniN + lastname;

        System.out.println("Las dos primeras letras de tu nombre con tu apellido es: " + nameLastname);

        lectura.close();
    }
}
