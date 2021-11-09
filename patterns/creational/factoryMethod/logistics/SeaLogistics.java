package patterns.creational.factoryMethod.logistics;

public class SeaLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Ship();
    }
}
