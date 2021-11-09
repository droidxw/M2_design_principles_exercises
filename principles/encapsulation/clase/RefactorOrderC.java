package encapsulation.clase;
///clase de precio de orden
import java.util.ArrayList;

public class RefactorOrderC {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;
    private double taxValue;
    GetTax g= new GetTax();
//   
//    double taxValue= 0;

    public RefactorOrderC(String country) {
    this.taxValue=0.0;
    this.country=country;
//    	total;

    }
    
////******Clase a refactorizar en base a otra clase******
    
    public double getTotal() {
    	double total= 0;
    	 System.out.println("pais "+ country);
      //obtiene precio en base al precio y cantidad
        for (Item item: items) {        	
//        	total =total+...
            total += item.getPrice() * item.getQuantity();
            System.out.println("\nprecio "+ total);
            //obtiene de precio el precio total con impuestos incluidos
            //por medio de getTax() 
//            total =g.getTax(total,country); 
            g.setCountry(this.country);
            total =g.getTax(total); 
        
            System.out.println("precio + impuestos "+ total);
        }
        return total;
    }    

////******Clase a refactorizar en base otra clase******

    public void addItem(Item item) {
        items.add(item);
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

   
}
