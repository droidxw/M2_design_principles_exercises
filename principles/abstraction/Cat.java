package abstraction;

public class Cat {
	private String name;
    private double energy;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	
	 public Cat(String name)
	    {
	        this.name = name;
	    }
///Aumenta nivel de energia en base al nivel nutricional
//	 Dependencia alta con la clase Sausage
	    public void eat(Sausage sausage) {
	        energy += sausage.getNutrition();
	    }

	    public String getName()
	    {
	        return name;
	    }

	    public void setName(String name)
	    {
	        this.name = name;
	    }

	    public double getEnergy()
	    {
	        return energy;
	    }

	    public void setEnergy(double energy)
	    {
	        this.energy = energy;
	    }
	
}
