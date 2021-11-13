
package lab_poo5;


public abstract class DispositivoElectronico {
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


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    private String marca;
    private String modelo;
    private String color;
    
    
    
    public abstract void encender();
    public abstract String apagar();

}
