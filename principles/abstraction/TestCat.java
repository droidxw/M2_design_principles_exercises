package abstraction;
import java.util.Date;

public class TestCat {

	public TestCat() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancias
		Cat cat=new Cat("Benito");
		Date expiration=new Date();
		Sausage sausage=new Sausage(2.3, "Rosa", expiration);	
		//Instancias
		
		
		
		System.out.println("Benito no ha comido: "+cat.getEnergy());
		cat.eat(sausage);//	
		
		
		System.out.println("Benito ya comio: "+cat.getEnergy());
		
	
	}

}
