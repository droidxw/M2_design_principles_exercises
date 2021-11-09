package composicion.Transport;
//package composicion;

public abstract class Transport {
//	public class Transport {
	
		
		
	public void deliver (String destination, String cargo) {
		// TODO Auto-generated constructor stub
		this.navigate();
		this.move();
		System.out.println(cargo + "sea ha entregado a: "+destination);
	}

	

	public Transport() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void navigate();
	public abstract void move();

}
