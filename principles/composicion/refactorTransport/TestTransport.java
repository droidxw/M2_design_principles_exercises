package composicion.refactorTransport;

public class TestTransport {
//
//	public TestTransport() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		Engine engine=new ElectricEngine();
		Driver driver=new Robot();	
		Engine fusionEngine=new FusionEngine();
		Driver driver2=new Human();	
		Engine combustionEngine=new CombustionEngine();
		Driver driver3=new Robot();
		
		Transport transport=new Transport(engine, driver);
		transport.deliver("Puebla","Libros");
		// TODO Auto-generated method stub
		Transport transport2=new Transport(fusionEngine, driver);
		transport2.deliver("Morelos","Esculturas");

		Transport transport3=new Transport(combustionEngine, driver3);
		transport2.deliver("Yucatan","Pescado");
	}

}
