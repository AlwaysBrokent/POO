
package lab_poo2;

public class Gato extends Animal {
         private String raza; 

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void maullar(){
        System.out.println("El gato maulla");
    }
    
    public void brincar(){
        System.out.println("El gato brinca");
    }
}
