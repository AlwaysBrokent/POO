package lab_poo2;

public class Animal {

    private String carnivoro;

    public String getCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(String carnivoro) {
        this.carnivoro = carnivoro;
    }

    public void comer() {
        System.out.println("El animal come");
    }

    public void respirar() {
        System.out.println("El animal respira");
    }

}
