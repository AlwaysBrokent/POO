package lab_poo2;

public class Perro extends Animal {

    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El perro ladra");
    }

    public void caminar() {
        System.out.println("El perro camina");
    }
}
