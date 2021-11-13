
package lab_poo10;


public class Lab_POO10 {


    public static void main(String[] args) {
       Vehiculo car = new Vehiculo();
       
        car.setmarca(Vehiculo.marca.TOYOTA);
        car.setMatricula("1");
        System.out.println("El automovil "+car.getMarca()+" tiene la matricula "+car.getMatricula());
        
        car.setmarca(Vehiculo.marca.FORD);
        car.setMatricula("12");
        System.out.println("El automovil "+car.getMarca()+" tiene la matricula "+car.getMatricula());
        
        car.setmarca(Vehiculo.marca.RENAULT);
        car.setMatricula("123");
        System.out.println("El automovil "+car.getMarca()+" tiene la matricula "+car.getMatricula());
        
        car.setmarca(Vehiculo.marca.SEAT);
        car.setMatricula("1234");
        System.out.println("El automovil "+car.getMarca()+" tiene la matricula "+car.getMatricula());
        
        car.setmarca(Vehiculo.marca.SUZUKI);
        car.setMatricula("12345");
        System.out.println("El automovil "+car.getMarca()+" tiene la matricula "+car.getMatricula());
    }
    
}
