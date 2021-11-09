package encapsulation.clase;

public class GetTax {

	private String country;
	public GetTax() {
		// TODO Auto-generated constructor stub		
//		double t, String v
//		this.taxValue=t
		this.country = "";
	}

	
//    public double getTax(double value, String zone) {
    	 public double getTax(double value) {
//    	asigno valor de entrada para agregarle los impuestos  y regresarlo al calculo total
    	double taxValue= value;
//    	this.country= zone;
    	 System.out.println("paisT "+ this.country);
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
    
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	
}
