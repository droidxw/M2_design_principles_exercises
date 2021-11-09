package patterns.creational.factoryMethod.logistics;

public class RoadLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Truck();
    }
}
