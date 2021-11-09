package patterns.creational.builder.house;

public class GarageHouse extends House
{
    public String garage;

    public String getGarage()
    {
        return garage;
    }

    public void setGarage(String garage)
    {
        this.garage = garage;
    }

    @Override
    public String toString()
    {
        return "GarageHouse{" +
               "garage='" + garage + '\'' +
               '}' + super.toString();
    }
}
