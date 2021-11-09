package encapsulation.clase;

public class TestOrder {

	public TestOrder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String country1="";
		String country2="";
		// TODO Auto-generated method stub
		Item car=new Item(1, 300.00, 1);//Instancia item
		Item car2=new Item(2, 300.00, 1);//Instancia item
		
//		country1="MX";
//		Order order =new Order(country1);//Instancia para orden que dado el país e impuestos
//									// me regresa el total
//		order.addItem(car);//Pongo producto	
//		
//		System.out.println("Total a pagar en "+country1+":"+order.getTotal());
//		
//		country1="JP";
//	    order.setCountry(country1);
//		System.out.println("Total a pagar en "+country1+":"+order.getTotal());
				

		////
		country1="MX";
//		RefactorOrderC orderR =new RefactorOrderC("MX");//Instancia para orden que dado el país e impuestos
		RefactorOrderC orderR =new RefactorOrderC(country1);//Instancia para orden que dado el país e impuestos
		
//		RefactorOrderC o =new RefactorOrderC();
		// me regresa el total
		orderR.addItem(car2);//Pongo producto	
		
		System.out.println("(Refactor)Total a pagar en MX2: "+orderR.getTotal());
		
		orderR.setCountry("JP");
		System.out.println("(Refactor)Total a pagar en JP2: "+orderR.getTotal());
	}

}
