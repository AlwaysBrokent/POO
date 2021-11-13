package lab_poo7;

public class Automovil {

    private String marca;
    private String modelo;
    private String precio;
    private int gas;
    private String mov1;
    private String mov2;

    Automovil() {
        this("", "", "", 0, "", "");
    }

    Automovil(String marca, String modelo, String precio, int gas, String mov1, String mov2) {

        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
        setGas(gas);
        setMov1(mov1);
        setMov2(mov2);

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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public String getMov1() {
        return mov1;
    }

    public void setMov1(String mov1) {
        this.mov1 = mov1;
    }

    public String getMov2() {
        return mov2;
    }

    public void setMov2(String mov2) {
        this.mov2 = mov2;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = "Marca: " + this.marca + "        Modelo: " + this.modelo + "      Precio: " + this.precio;
        return cadena;
    }

    public String encender() {
        return "    El auto enciende con " + this.getGas() + "L de gas";

    }

    public String movimiento() {
        return "     El auto se mueve hacia " + this.mov1 + " y hacia la " + this.mov2;
    }
}
