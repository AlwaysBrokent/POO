
package lab_poo5;

import java.util.Scanner;


public class Lab_POO5 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int[] Telefono = new int[5];
        
        
        Contacto[] c = new Contacto[5]; 
        
        
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Introduzca el numero de telefono # "+(i+1));
            Telefono[i]= sc.nextInt();
            
            for (int j = 0; j < 5; j++) {
                c[j] = new Contacto();
                System.out.println("Contacto # "+(j+1));
                
                
                System.out.println("Introduzca un nombre");
              
                String nombre= sc.nextLine();
                c[j].setNom(nombre);
                
                
                
                System.out.println("Introduzca el email");
                String email=sc.nextLine();
                c[j].setMail(email);
                
            }
  
   
        }
        
        System.out.println("Lista de contactos: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero de telefono # "+(i+1));
            System.out.println(Telefono[i]);
            
            for (int j = 0; j < 5; j++) {
                System.out.println("Contacto # "+(j+1));
            System.out.println(c[j].getNom());
            System.out.println(c[j].getMail());
            }
            
            
          
        }
        

        Telefono t= new Telefono();
        
        System.out.println("Introduce la marca del telefono");
        t.setMarca(sc.nextLine());
        System.out.println("Introduce el color del telefono");
        t.setColor(sc.nextLine());
        System.out.println("Introduce el modelo del telefono");
        t.setModelo(sc.nextLine());
        
        System.out.println("Telefono "+t.getMarca()+" "+t.getColor()+" "+t.getModelo());
        t.encender();
        
        
        System.out.println("Introduce la contraseña del WiFi"); 
        String wifi=sc.nextLine();
        t.setPasswordWF(wifi);
        
        System.out.println("Introduce el número de contacto a llamar");
        
        int a= sc.nextInt();
        t.iniciarLlamada(a);
        System.out.println("Juan");
        
        t.apagar();
    }
    
}
