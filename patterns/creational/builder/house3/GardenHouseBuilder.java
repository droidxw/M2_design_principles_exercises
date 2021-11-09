package patterns.creational.builder.house3;

public class GardenHouseBuilder implements Builder
{
    private GardenHouse gardenHouse;

    public GardenHouseBuilder() {
        this.reset();
    }

    @Override
    public void reset()
    {
        gardenHouse = new GardenHouse();
    }

    @Override
    public void buildRooms(int number)
    {
        gardenHouse.setRooms(number);
    }

    @Override
    public void buildDoors(int number)
    {
        gardenHouse.setDoors(number);
    }

    @Override
    public void buildWindows(int number)
    {
        gardenHouse.setWindows(number);
    }

    @Override
    public void buildGarage(String type)
    {

    }

    @Override
    public void buildSwimmingPool(String type)
    {

    }

    @Override
    public void buildGarden(String type)
    {
        gardenHouse.setGarden(type);
    }

    public GardenHouse getProduct() {
        GardenHouse product = this.gardenHouse;
        this.reset();
        return product;
    }
}
