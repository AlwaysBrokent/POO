
package lab_poo3;


public abstract class DispositivoElectronico {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    private String marca;
    private String modelo;
    private String color;
    
    public abstract void enceder();
    public abstract String apagar();
}
