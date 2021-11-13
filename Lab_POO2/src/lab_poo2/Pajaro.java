
package lab_poo2;

public class Pajaro extends Animal {
    private String raza;    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void volar(){
        System.out.println("El ave vuela");
    }
}
