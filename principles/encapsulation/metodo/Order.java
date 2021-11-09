///clase de precio de orden

package encapsulation.metodo;
import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;

    public Order(String country) {
        this.country = country;
    }
////Clase a refactorizar en base a  método
    public double getTotal() {
        double total = 0;
      //obtiene precio en base al precio y cantidad
        for (Item item: items) {
        	total =total+ item.getPrice() * item.getQuantity();
//            total += item.getPrice() * item.getQuantity();
        }
      //obtiene impuesto en base al país 
        if (country == "MX") {
            total += total * 0.16;
        }
        else if (country == "US") {
            total += total * 0.07;
        }
        else if (country == "EU") {
            total += total * 0.21;
        }
        else if (country == "JP") {
            total += total * 0.10;
        }

        return total;
    }
////Clase a refactorizar en base a  método

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
