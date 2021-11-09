package patterns.creational.factoryMethod.logistics;

public class Truck implements Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering by land in a box.");
    }
}
