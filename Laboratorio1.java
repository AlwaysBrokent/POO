package laboratorio.pkg1;
import java.util.Scanner;

public class Laboratorio1 {

    public static void main(String[] args) {
        Scanner scnNom = new Scanner(System.in);
        
        Cuenta cta1 = new Cuenta("Juan Antonio Gonzalez", "2076321", 1.5, 550);
                
        System.out.println("Nombre: ");
        String nom = scnNom.nextLine();
        System.out.println("Cuenta: ");
        String numCuenta = scnNom.nextLine();
        System.out.println("Interes: ");
        double tipoint = scnNom.nextDouble();
        System.out.println("Saldo: ");
        double saldo = scnNom.nextDouble();
        System.out.println("Dinero para ingreso y reintegro: ");
        double cnt = scnNom.nextDouble();
        
        Cuenta cta2 = new Cuenta(nom, numCuenta, tipoint, saldo);
        
        Cuenta cta3 = new Cuenta(cta2);
        
        cta1.deposito(cnt);
        cta2.retiro(cnt);
        cta2.transferencia(cta3, cnt);
        
        
        System.out.println("\nResultados en las cuentas");
        System.out.println("Cuenta 1.\nNombre: "+cta1.getNomCliente()+"\nCuenta: "+cta1.getNumCuenta());
        System.out.println("Tipo de interés: "+cta1.getTipointeres()+"\nSaldo: "+cta1.getSaldo()+"\n");
        
        System.out.println("Cuenta 2.\nNombre: "+cta2.getNomCliente()+"\nCuenta: "+cta2.getNumCuenta());
        System.out.println("Tipo de interés: "+cta2.getTipointeres()+"\nSaldo: "+cta2.getSaldo()+"\n");
        
        System.out.println("Cuenta 3.\nNombre: "+cta3.getNomCliente()+"\nCuenta: "+cta3.getNumCuenta());
        System.out.println("Tipo de interés: "+cta3.getTipointeres()+"\nSaldo: "+cta3.getSaldo()+"\n");
    }
    
}
