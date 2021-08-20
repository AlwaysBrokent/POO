
package actividad.de.aprendizaje.pkg2;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private char genero; //H=hombre, M=Mujer
    private float peso; //En kg
    private float altura; //En m
   
    //constructor 1
    public Persona() {
    }
    
    //constructor 2
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    //constructor 3
    public Persona(String nombre, int edad, char genero, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //métodos
    public int calcularIMC(float peso, float altura){
        float IMC;
        
        IMC=peso/altura;
        if(IMC<20){
            return -1;
        }else if(IMC>=20 && IMC<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayordeEdad(int edad){
        boolean mayor;
        if(edad>=18){
            mayor = true;
        }else{
            mayor = false;
        }
        return mayor;
    }
    
    public char comprobarGenero(char genero){
        char genre;
        
        if(genero == 'H' || genero == 'M'){
            genre = genero;
        }else{
            genre = 'H';
        }
        return genre;
    }
    
    public String toString(String nombre, int edad, float peso, float altura){
        return "Nombre: "+nombre+". Edad: "+edad+". Peso: "+peso+". Altura: "+altura;
    }    
}
