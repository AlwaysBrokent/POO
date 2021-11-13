package lab_poo4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Metodos {

    public static void Problema1() {

        Scanner sc = new Scanner(System.in);
        String st;

        System.out.println("Introduce una cadena separada por guiones: ");
        st = sc.nextLine();

        System.out.println(esPalindromo(st));

    }

    public static String esPalindromo(String cadena) {
        cadena = cadena.replace("-", " ");
        return cadena;
    }

    public static void Problema2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena : ");
        String original = sc.nextLine();
        System.out.println("Introduce otra cadena : ");
        String subcadena = sc.nextLine();

        boolean termina = original.endsWith(subcadena);
        boolean empieza = subcadena.startsWith(original);

        if (empieza == true && termina == true) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    public static void Problema3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena : ");
        String original = sc.nextLine();
        System.out.println("Introduce otra cadena : ");
        String subcadena = sc.nextLine();

        boolean termina1 = original.endsWith(subcadena);
        boolean empieza1 = original.startsWith(subcadena);

        boolean termina2 = subcadena.endsWith(original);
        boolean empieza2 = subcadena.startsWith(original);

        if (empieza1 == true) {
            System.out.println("La cadena orignila incia con la subcadena");
        } else {
            System.out.println("La cadena original no inicia con la subcadena");
        }

        if (termina1 == true) {
            System.out.println("La cadena orignila termina con la subcadena");
        } else {
            System.out.println("La cadena original no termina con la subcadena");
        }

        if (empieza2 == true) {
            System.out.println("La subcadena incia con la original");
        } else {
            System.out.println("La subcadena no inicia con la original");
        }

        if (termina2 == true) {
            System.out.println("La subcadena termina con la original");
        } else {
            System.out.println("La subcadena  no termina con la original");
        }
    }

    public static void Problema4() {
        Scanner sc = new Scanner(System.in);
        String string;
        String caracter;
        System.out.println("Introduce una cadena: ");
        string = sc.nextLine();
        System.out.println("Introduce un caracter: ");
        caracter = sc.next();

        int cont = contarCaracteres(string, caracter);

        System.out.println("La cantidad de " + caracter + " es:" + cont);

    }

    public static int contarCaracteres(String cadenaTexto, String caracater) {

        int pos = 0;
        int contador = 0;

        pos = cadenaTexto.indexOf(caracater);

        while (pos != -1) {
            contador++;
            pos = cadenaTexto.indexOf(caracater, pos + 1);
        }
        return contador;

    }

    public static void Problema5() {
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Introduce una cadena: ");
        string = sc.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");

        System.out.println("Cantidad de palabras: " + stringTokenizer.countTokens());
    }

    public static void Problema6() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        System.out.println("Introduce un nombre en minusculas: ");
        nombre = sc.nextLine();
        System.out.println("Introduce un apellido en minusculas");
        apellido = sc.nextLine();

        String nombreM = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
        String apellidoM = apellido.toUpperCase().charAt(0) + apellido.substring(1, apellido.length()).toLowerCase();

        System.out.println("Nombre corregido: " + nombreM + " " + apellidoM);
    }

    public static void Problema7() {

        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Introduce un cadena: ");
        string = sc.nextLine();

        StringBuilder sb = new StringBuilder(string);

        System.out.println("La cadena inversa es: " + sb.reverse());
    }

    public static void Problema8(){
         Scanner sc = new Scanner(System.in);
        String string;
        char a,b;
        System.out.println("Introduce un cadena: ");
        string = sc.nextLine();
        System.out.println("Introduce un caracter a");
        a=sc.next().charAt(0);
        System.out.println("Introduce un caracter b");
        b=sc.next().charAt(0);
        
        String cadena=cambiarCaracter(string,a,b);
        
        System.out.println("La cadena cambiando los caracteres es: "+cadena);
        
    }
    
    
    public static String cambiarCaracter(String cadena,char a,char b) {
        cadena = cadena.replace(a,b);
        return cadena;
    }
    
    public static void Problema9(){
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Introduce un cadena: ");
        string = sc.nextLine();

        StringBuilder nuevaCadena = new StringBuilder(); 
        
     for(int x=0;x<string.length();x++){
         
         char caracter=string.charAt(x);
         
         if(Character.isUpperCase(caracter)){         
          nuevaCadena.append(Character.toLowerCase(string.charAt(x))); 
        } 
         
         if(Character.isLowerCase(caracter)){         
          nuevaCadena.append(Character.toUpperCase(string.charAt(x))); 
        }  
     }
         System.out.println(nuevaCadena);
    }
    
    public static void Problema10(){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Introduce una cadena");
                
        String original = sc.nextLine();
        
        System.out.println("Introduce una subcadena");
        String subcadena = sc.nextLine();

        if (original.contains(subcadena)) {
            System.out.println("La cadena original contiene la subcadena");
        } else {
            System.out.println("No contiene la subcadena");
        }
    }
    
    public static void Problema11(){
         Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Introduce una cadena: ");
        string = sc.nextLine();

        System.out.println(string + " es palindromo? " + esPalindromo2(string));

    }
    public static boolean esPalindromo2(String cadena) {
        cadena = cadena.toLowerCase().replace(" ", "").replace(".", "").replace(",", "");
        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }
    
    
    
    
}
