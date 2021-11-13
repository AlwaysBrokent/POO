
package lab_poo3;

import java.util.Scanner;

public class Lab_POO3 {


    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
        Television tvSamsung = new Television();
        Radio rdSony = new Radio();
        Calculadora clCasio = new Calculadora ();
        
        
        System.out.println("Television");
        
        System.out.println("Introduce la marca: ");
        tvSamsung.setMarca(sc.nextLine());
        System.out.println("Introduce el modelo: ");
        tvSamsung.setModelo(sc.nextLine());
        System.out.println("Introduce el color: ");
        tvSamsung.setColor(sc.nextLine());
        System.out.println("");
        
        System.out.println("La marca es:"+tvSamsung.getMarca());
        System.out.println("El modelo es:"+tvSamsung.getModelo());
        System.out.println("El color es:"+tvSamsung.getColor());
        
        tvSamsung.enceder();
        System.out.println(tvSamsung.subirCanal());
        System.out.println(tvSamsung.bajarCanal());
        tvSamsung.subirVolumen();
        tvSamsung.bajarVolumen();
        System.out.println(rdSony.apagar());
        
        System.out.println("--------------------------------------------------");
                
        System.out.println("Radio");
        
        System.out.println("Introduce la marca: ");
        rdSony.setMarca(sc.nextLine());
        System.out.println("Introduce el modelo: ");
        rdSony.setModelo(sc.nextLine());
        System.out.println("Introduce el color: ");
        rdSony.setColor(sc.nextLine());
        System.out.println("");
        

        System.out.println("La marca es:"+rdSony.getMarca());
        System.out.println("El modelo es:"+rdSony.getModelo());
        System.out.println("El color es:"+rdSony.getColor());
        
        rdSony.enceder();
        System.out.println(rdSony.subirCanal());
        System.out.println(rdSony.bajarCanal());
        rdSony.subirVolumen();
        rdSony.bajarVolumen();
        System.out.println(rdSony.apagar());
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("Calculadora");
        
        System.out.println("Introduce la marca: ");
        clCasio.setMarca(sc.nextLine());
        System.out.println("Introduce el modelo: ");
        clCasio.setModelo(sc.nextLine());
        System.out.println("Introduce el color: ");
        clCasio.setColor(sc.nextLine());
        System.out.println("");

        
        System.out.println("La marca es:"+clCasio.getMarca());
        System.out.println("El modelo es:"+clCasio.getModelo());
        System.out.println("El color es:"+clCasio.getColor());
        
        clCasio.enceder();
        
        System.out.println("Operaciones (Valores enteros)");
        
        System.out.println("Introduzca el valor de a : ");
        int a = sc.nextInt();
        System.out.println("Introduzca el valor de b : ");
        int b= sc.nextInt();
        
        
        System.out.println("La suma de a + b es: "+clCasio.suma(a, b));
        System.out.println("La resta de a - b es: "+clCasio.resta(a, b));
        System.out.println("La multiplicación de a * b es: "+clCasio.multiplicacion(a, b));
        System.out.println("La division de a - b es: "+clCasio.division(a, b));
        
        clCasio.apagar();
        
        
        System.out.println("--------------------------------------------------");
        
        
    }
    
}
