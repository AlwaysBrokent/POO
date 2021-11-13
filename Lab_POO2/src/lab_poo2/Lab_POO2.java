
package lab_poo2;


public class Lab_POO2 {

    public static void main(String[] args) {
       
        Persa persa = new Persa();
        Siames siam = new Siames();
        
        Canario cana = new Canario();
        Perico peri = new Perico();       
        
        Pastor  past = new Pastor();
        Chihuahua chih = new Chihuahua();
        
        
        persa.setCarnivoro("Carnivoro");
        System.out.println(persa.getCarnivoro());
        persa.setRaza("Persa");
        System.out.println("Raza: "+persa.getRaza());
        persa.comer();
        persa.respirar();
        persa.brincar();
        persa.maullar();
        persa.correr();
        System.out.println("-------------------");
        
        siam.setCarnivoro("Carnivoro");
        System.out.println(siam.getCarnivoro());
        siam.setRaza("Siames");
        System.out.println("Raza: "+siam.getRaza());
        siam.comer();
        siam.respirar();
        siam.brincar();
        siam.maullar();
        siam.correr();
        System.out.println("-------------------");
        
        
        cana.setCarnivoro("Herbivoro");
        System.out.println(cana.getCarnivoro());
        cana.setRaza("Canario");
        System.out.println("Raza: "+cana.getRaza());
        cana.comer();
        cana.respirar();
        cana.volar();
        cana.cantar();
        System.out.println("-------------------");
        
        peri.setCarnivoro("Herbivoro");
        System.out.println(peri.getCarnivoro());
        peri.setRaza("Perico");
        System.out.println("Raza: "+peri.getRaza());
        peri.comer();
        peri.respirar();
        peri.volar();
        peri.cantar();
        System.out.println("-------------------");  
       
        
        past.setCarnivoro("Carnivoro");
        System.out.println(past.getCarnivoro());
        past.setRaza("Pastor Aleman");
        System.out.println("Raza: "+past.getRaza());
        past.comer();
        past.respirar();
        past.caminar();
        past.ladrar();
        past.correr();
        System.out.println("-------------------");
        
        chih.setCarnivoro("Carnivoro");
        System.out.println(chih.getCarnivoro());
        chih.setRaza("Chihuahua");
        System.out.println("Raza: "+chih.getRaza());
        chih.comer();
        chih.respirar();
        chih.caminar();
        chih.ladrar();
        chih.correr();
        System.out.println("-------------------");
        
    }
    
}
