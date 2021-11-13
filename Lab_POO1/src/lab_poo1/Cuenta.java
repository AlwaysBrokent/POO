
package lab_poo1;

public class Cuenta {
    
    private String nomCliente;
    private String numCuenta;
    private Double tipointeres;
    private Double saldo;
    
    public Cuenta(){
    }
    
    public Cuenta(String nomCliente, String numCuenta, double tipointeres, double saldo){
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.tipointeres = tipointeres;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta objCuenta){
        this.nomCliente = objCuenta.nomCliente;
        this.numCuenta = objCuenta.numCuenta;
        this.tipointeres = objCuenta.tipointeres;
        this.saldo = objCuenta.saldo;
    }
    
    public String getNomCliente(){
        return nomCliente;
    }

    public void setNomCliente(String nomCliente){
        this.nomCliente = nomCliente;
    }

    public String getNumCuenta(){
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta){
        this.numCuenta = numCuenta;
    }

    public Double getTipointeres(){
        return tipointeres;
    }

    public void setTipointeres(Double tipointeres){
        this.tipointeres = tipointeres;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    
    public boolean deposito (double cnt){
        boolean depositoDone = true;
            if(cnt < 0){
                depositoDone = false;
            }
            else{
                this.saldo = this.saldo + cnt;
            }
        return depositoDone;
    }
    
    public boolean retiro (double cnt){
        boolean retiroDone = true;
        if(cnt < 0){
            retiroDone = false;
        }else if(this.saldo<cnt){
            retiroDone = false;
        }else{
            this.saldo -= cnt;
        }
        return retiroDone;
    }
    
    public boolean transferencia (Cuenta objCuenta, double cnt){
        boolean transferenciaDone = true;
        if(cnt < 0){
            transferenciaDone = false;
        }else if(this.saldo<cnt){
            transferenciaDone = false;
        }else{
            retiro(cnt);
            objCuenta.deposito(cnt);
        }
        return transferenciaDone;
    }
}