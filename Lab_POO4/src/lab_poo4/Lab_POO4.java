
package lab_poo4;

import java.util.Scanner;

public class Lab_POO4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la opcion deseada: ");
        
        int op= sc.nextInt();       
        
       do{ 
        switch(op){
            
            case 1:
                Metodos.Problema1();
                break;
            case 2:
                Metodos.Problema2();
                break;
            case 3:
                Metodos.Problema3();
                break;
            case 4:
                Metodos.Problema4();
                break;
            case 5:
                Metodos.Problema5();
                break;
            case 6:
                Metodos.Problema6();
                break;
            case 7:
                Metodos.Problema7();
                break;
            case 8:
                Metodos.Problema8();
                break;
            case 9:
                Metodos.Problema9();
                break;
            case 10:
                Metodos.Problema10();
                break;     
            case 11:
                Metodos.Problema11();
                break;
        }
        }while(op<=11);
        
        
    }
    
}
