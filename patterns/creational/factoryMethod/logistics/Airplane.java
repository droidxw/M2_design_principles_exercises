package patterns.creational.factoryMethod.logistics;

public class Airplane implements Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering by air in an envelop.");
    }
}
