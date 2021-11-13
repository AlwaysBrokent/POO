package lab_poo6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_POO6 {

    public static void main(String[] args) {
        String marca, modelo, precio, color;
        Scanner sc = new Scanner(System.in);

        ArrayList<Automovil> auto = new ArrayList<Automovil>(10);
        Automovil[] coche = new Automovil[10];

        for (int i = 0; i < coche.length; i++) {
            coche[i] = new Automovil();
            System.out.println("Automovil " + (i + 1));
            System.out.print("Marca: ");
            marca = sc.next();
            coche[i].setMarca(marca);
            System.out.print("Modelo: ");
            modelo = sc.next();
            coche[i].setModelo(modelo);
            System.out.print("Precio: ");
            precio = sc.next();
            coche[i].setPrecio(precio);
            System.out.println("\n");
        }

        auto.add(coche[0]);
        auto.add(coche[1]);
        auto.add(coche[2]);
        auto.add(coche[3]);
        auto.add(coche[4]);
        auto.add(coche[5]);
        auto.add(coche[6]);
        auto.add(coche[7]);
        auto.add(coche[8]);
        auto.add(coche[9]);

        System.out.println("\n\nCoches: ");
        for (int i = 0; i < auto.size(); i++) {
            System.out.println("----- Coche ---- " + auto.get(i).getMarca());
            System.out.println("Modelo: " + auto.get(i).getModelo());
            System.out.println("Precio: " + auto.get(i).getPrecio());
            auto.get(i).encender();
            auto.get(i).avanza();
            auto.get(i).girarIzq();
            auto.get(i).apagar();
        }

        /*  ArrayList<Tren> tr = new ArrayList<Tren>(10); 
       Tren[] tren = new Tren[10];
        
            for (int i = 0; i < 5; i++) {
            tren[i]= new Tren();
            System.out.println("Tren "+(i+1));
            System.out.print("Marca: ");
            marca = sc.next();
            tren[i].setMarca(marca);
            System.out.print("Modelo: ");
            modelo = sc.next();
            tren[i].setModelo(modelo);
            System.out.print("Precio: ");
            precio = sc.next();
            tren[i].setPrecio(precio);
            System.out.println("\n");
        }
        tr.add(tren[0]); tr.add(tren[1]); tr.add(tren[2]); tr.add(tren[3]); tr.add(tren[4]);
        
            for (int i = 5; i < 10; i++) {
            tren[i]= new Tren();
            System.out.println("Coche "+(i+1));
            System.out.print("Marca: ");
            marca = sc.next();
            tren[i].setMarca(marca);
            System.out.print("Modelo: ");
            modelo = sc.next();
            tren[i].setModelo(modelo);
            System.out.print("Precio: ");
            precio = sc.next();
            tren[i].setPrecio(precio);
            System.out.println("\n");
        }
        tr.add(tren[5]); tr.add(tren[6]); tr.add(tren[7]); tr.add(tren[8]); tr.add(tren[9]);
        
        System.out.println("\n\nTrenes: ");
        for (int i = 0; i < tr.size(); i++) {
            System.out.println("----- Transporte ---- " + tr.get(i).getMarca());
            System.out.println("Modelo: " + tr.get(i).getModelo());
            System.out.println("Precio: " + tr.get(i).getPrecio());
            tr.get(i).encender();
            tr.get(i).avanza();
            tr.get(i).girarIzq();
            tr.get(i).apagar();
        }*/
    }

}
