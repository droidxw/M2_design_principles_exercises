package composicion.refactorTransport;

public class Transport {

	private Engine engine;
	private Driver driver;	
	

	public Transport(Engine engine, Driver driver ) {
		// TODO Auto-generated constructor stub
		this.engine=engine;
		this.driver=driver;
	}
	
		
	public void deliver (String destination, String cargo) {
		// TODO Auto-generated constructor stub
		driver.navigate();
		engine.move();
		System.out.println(cargo + " sea ha entregado a: "+destination);
	}



}
