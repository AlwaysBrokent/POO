
package lab_poo3;


public class Radio extends DispositivoElectronico implements IFunciones {
        @Override
    public void enceder() {
         System.out.println("Radio se enciende");
    }

    @Override
    public String apagar() {
      return("Radio se apaga");
    }

    @Override
    public String subirCanal() {
        return("La radio sube una estación");
    }

    @Override
    public String bajarCanal() {
        return("La radio baja una estación");
    }

    @Override
    public void subirVolumen() {
        System.out.println("La radio sube el volumen");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("La radio baja el volumen");
    }
}
