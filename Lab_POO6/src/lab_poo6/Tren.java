
package lab_poo6;


public class Tren extends Transporte implements IAvanza {
   private String marca, modelo, precio;

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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public void encender() {
        System.out.println("El transporte enciende");

    }

    @Override
    public void girarIzq() {
        System.out.println("El transporte gira a la izquierda");
    }

    @Override
    public void apagar() {
        System.out.println("El transporte se apaga");
    }

    @Override
    public String avanza() {
        return "El transporte avanza";
    }  
}
