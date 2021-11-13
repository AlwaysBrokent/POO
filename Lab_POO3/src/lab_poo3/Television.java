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
public class Television extends DispositivoElectronico implements IFunciones{
    @Override
    public void enceder() {
        System.out.println("Television se enciende");
    }

    @Override
    public String apagar() {
       return("Television se apaga");
    }

    @Override
    public String subirCanal() {
        return("La television subio un canal");
    }

    @Override
    public String bajarCanal() {
        return("La television bajo un canal");
    }

    @Override
    public void subirVolumen() {
        System.out.println("La televisión subio el volumen");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("La televisión bajo el volumen");
    }
}
