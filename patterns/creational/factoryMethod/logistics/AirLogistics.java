package patterns.creational.factoryMethod.logistics;

public class AirLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Airplane();
    }
}
