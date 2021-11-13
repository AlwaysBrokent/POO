
package lab_poo7;

public class Lab_POO7 {

    public static void main(String[] args) {
             LeerArchivo aplicacionLeer = new LeerArchivo();

        Automovil arrayA[] = new Automovil[10];
        
        aplicacionLeer.abrirArchivo();
        
        for (int i = 0; i < 10; i++) {

            arrayA[i]= aplicacionLeer.leerDatos();
        }
   
        aplicacionLeer.cerrarArchivo();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayA[i].toString()+ arrayA[i].encender()+ arrayA[i].movimiento());
            
        }
    }
    
}
