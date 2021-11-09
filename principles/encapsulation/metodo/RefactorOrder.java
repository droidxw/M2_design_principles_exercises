///clase de precio de orden

package encapsulation.metodo;
import java.util.ArrayList;

public class RefactorOrder {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;
//    double taxValue= 0;

    public RefactorOrder(String country) {
        this.country = country;
    }
////******Clase a refactorizar en base a  método******
    
    public double getTotal() {
    	double total= 0;
      //obtiene precio en base al precio y cantidad
        for (Item item: items) {        	
//        	total =total+...
            total += item.getPrice() * item.getQuantity();
            System.out.println("\nprecio "+ total);
            //obtiene de precio el precio total con impuestos incluidos
            //por medio de getTax() 
            total =getTax(total);    
            System.out.println("precio + impuestos "+ total);
        }
        return total;
    }
    
        public double getTax(double value) {
//        	asigno valor de entrada para agregarle los impuestos  y regresarlo al calculo total
        	double taxValue= value;
      //obtiene impuesto en base al país 
      //multiplicar taxValuepor el impuesto y eso sumarselo a total
        if (country == "MX") {
            taxValue+= taxValue* 0.16;
        }
        else if (country == "US") {
            taxValue+= taxValue* 0.07;
        }
        else if (country == "EU") {
            taxValue+= taxValue* 0.21;
        }
        else if (country == "JP") {
            taxValue+= taxValue* 0.10;
        }

        return taxValue;
    }
////******Clase a refactorizar en base a  método******

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
