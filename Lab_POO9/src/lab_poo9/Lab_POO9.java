
package lab_poo9;
import Practica9.RWFile;
import java.util.Scanner;

public class Lab_POO9 {


    public static void main(String[] args) {
             RWFile rw = new RWFile();
       Scanner entrada = new Scanner(System.in); 
       
        System.out.println("Ingrese el nombre del archivo a manejar");
        
        String nombre= entrada.nextLine();
        
        rw.escribirArchivo(nombre+".txt");
        rw.leerArchivo(nombre+".txt");
    }
    
}
