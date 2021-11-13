/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_poo3;

/**
 *
 * @author SalirDePT
 */
public class Calculadora extends DispositivoElectronico implements IOperaciones {
    
    @Override
    public void enceder() {
        System.out.println("La calculadora enciende");
    }

    @Override
    public String apagar() {
        return("La calculadora se apaga");
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
       return a-b;
    }

    @Override
    public float multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public float division(int a, int b) {
        return a/b;
    }
}
