package patterns.creational.builder.house3;

public class GarageHouseBuilder implements Builder
{
    private GarageHouse garageHouse;

    public GarageHouseBuilder() {
        this.reset();
    }

    @Override
    public void reset()
    {
        garageHouse = new GarageHouse();
    }

    @Override
    public void buildRooms(int number)
    {
        garageHouse.setRooms(number);
    }

    @Override
    public void buildDoors(int number)
    {
        garageHouse.setDoors(number);
    }

    @Override
    public void buildWindows(int number)
    {
        garageHouse.setWindows(number);
    }

    @Override
    public void buildGarage(String type)
    {
        garageHouse.setGarage(type);
    }

    @Override
    public void buildSwimmingPool(String type)
    {

    }

    @Override
    public void buildGarden(String type)
    {

    }

    public GarageHouse getProduct() {
        GarageHouse product = this.garageHouse;
        this.reset();
        return product;
    }
}
