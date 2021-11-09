package abstraction;
import java.util.Date;

public class refactorTestCat {

	public refactorTestCat() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancias
		refactorCat salem=new refactorCat("Benito");
		Date expiration=new Date();
		refactorSausage sausage=new refactorSausage(2.3, "Rosa", expiration);	
		//Instancias
		
		Fish fish=new Fish(5.7, "Salmon", expiration);
		
		System.out.println("Benito no ha comido: "+salem.getEnergy());
		salem.eat(sausage);//	
		salem.eat(fish);//	
		
		
		System.out.println("Benito ya comio: "+salem.getEnergy());
		
	
	}

}
