
package lab_poo11;

import java.util.Random;
import java.util.Scanner;


public class Lab_POO11 {

    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        int op;

        do {
            System.out.println("-------------------------------------");
            System.out.println("                 Menú                ");
            System.out.println("-------------------------------------");
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1.- Funcion convertir int to string");
            System.out.println("2.- Función suma n números");
            System.out.println("3.- Generar X numeros random y contar cuantos números termina por el numero x");
            System.out.println("4.- Muestre los números del 1 al 100 utilizando la instrucción while");
            System.out.println("5.- Muestre los números del 1 al 100 utilizando la instrucción do..while");
            System.out.println("6.- Muestre los números del 1 al 100 utilizando la instrucción for ");
            System.out.println("7.- Convertir a números romanos");
            System.out.println("8.- Salir\n");
            op = s.nextInt();
            for (int i = 0; i < 5; i++) {
                System.out.println();
            }
            switch (op) {
                case 1:
                    convertir();
                    break;
                case 2:
                    suma_n();
                    break;
                case 3:
                    x_num();
                    break;
                case 4:
                    uno();
                    break;
                case 5:
                    dos();
                    break;
                case 6:
                    tres();
                    break;
                case 7:
                    romano();
                    break;

            }

        } while (op != 8);

    }

    private static void convertir() {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el Entero a convertir");
        int num = s.nextInt();

        String num_s = Integer.toString(num);

        System.out.println("Impresión del string");
        System.out.println(num_s);

    }

    private static void suma_n() {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a sumar: ");
        int can = s.nextInt();
        int i = 0, total = 0;

        do {
            System.out.println("Número" + (i + 1) + "a sumar");
            int sum = s.nextInt();

            total = total + sum;

            i++;

        } while (i != can);

        System.out.println("Suma total: " + total);

    }

    private static void uno() {
        int i = 1;
        while (i != 101) {
            System.out.println(i);
            i++;
        }
    }

    private static void dos() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i != 101);
    }

    private static void tres() {

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }

    private static void romano() {

        Scanner s = new Scanner(System.in);
        System.out.println("Entero a convertir");
        int num = s.nextInt();

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] valores_romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                num -= valores[i];
                roman.append(valores_romanos[i]);
            }
        }
        System.out.println("Número romano: " + roman.toString());

    }

    private static void x_num() {

        Scanner sc = new Scanner(System.in);
        int i = 0, contador = 0;

        System.out.println("Ingresa la cantidad de número a comparar");
        int comp = sc.nextInt();

        System.out.println("Introduce la terminación a contar");
        int cont = sc.nextInt();

        Random ran = new Random();
        System.out.println("\n");
        for (int j = 0; j < comp; j++) {
            int x;
            x = ran.nextInt(101);
            System.out.println(x);

            if ((x % 10) == cont) {
                contador ++;
            }

        }

        System.out.println("Se han introducido " + contador + " números acabados en " + cont);

    }
    
   
}
