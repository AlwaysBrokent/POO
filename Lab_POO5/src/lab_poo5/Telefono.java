/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_poo5;

/**
 *
 * @author SalirDePT
 */
public class Telefono extends DispositivoElectronico implements IWifiConexion {

    @Override
    public void encender() {
        System.out.println("Encender telefono");
    }

    @Override
    public String apagar() {
        System.out.println("Apagar telefono");
        return null;
    }

    @Override
    public String setPasswordWF(String psswd) {
        if (psswd.isEmpty()) {
            System.out.println("Conexion fallida");
        }
        return ("Conexion correcta");
    }

    public String iniciarLlamada(int a) {

        System.out.println("llamando a");
        return null;
    }
}
