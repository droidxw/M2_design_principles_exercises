package abstraction;

public class refactorCat {
	private String name;
    private double energy;

	public refactorCat() {
		// TODO Auto-generated constructor stub
	}

	
	 public refactorCat(String name)
	    {
	        this.name = name;
	    }
///Aumenta nivel de energia en base al nivel nutricional
//	 Dependencia alta con la clase Sausage
	 //se utiliza la interfaz food para mediante ella obtener el valor nutricional
	    public void eat(Food food) {
	        energy += food.getNutrition();
	    }
	    //se utiliza la interfaz food para mediante ella obtener el valor nutricional

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
