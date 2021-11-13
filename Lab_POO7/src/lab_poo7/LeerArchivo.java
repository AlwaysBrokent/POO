
package lab_poo7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LeerArchivo {

    private Scanner entrada;

    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("Autos.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println("Error");
            System.exit(1);
        }
    }

    public Automovil leerDatos() {
        Automovil datos = new Automovil();

        while (entrada.hasNext()) {

            datos.setMarca(entrada.next());
            datos.setModelo(entrada.next());
            datos.setPrecio(entrada.next());
            datos.setGas(entrada.nextInt());
            datos.setMov1(entrada.next());
            datos.setMov2(entrada.next());

            return datos;
        }
        return datos;

    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }
    }
}
