
package lab_poo6;

public class Automovil extends Transporte implements IAvanza {
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
        System.out.println("El Automovil encendió");
    }

    @Override
    public void girarIzq() {
        System.out.println("El automovil gira a la izquierda");
    }

    @Override
    public String avanza() {
        return "El automovil avanza ";
    }

    @Override
    public void apagar() {
        System.out.println("El automovil se apagó");
    }
}
