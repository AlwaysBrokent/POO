
package lab_poo10;


public class Vehiculo {
    enum marca{FORD, TOYOTA, SUZUKI, RENAULT, SEAT};
   
    private String matricula;
    private marca marca;

    public Vehiculo(){
        matricula = "";
        marca = null;
    }
    
    public void setMatricula(String ma){
        matricula = ma;
    }
    
     public String getMatricula(){
        return matricula;
    }   
    
     public void setmarca(marca c){
        marca = c;
    }
    public marca getMarca(){
        return marca;
    }
}
