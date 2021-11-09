package patterns.creational.builder.house3;

public class SwimmingPoolHouseBuilder implements Builder
{
    private SwimmingPoolHouse swimmingPoolHouse;

    public SwimmingPoolHouseBuilder() {
        this.reset();
    }

    @Override
    public void reset()
    {
        swimmingPoolHouse = new SwimmingPoolHouse();
    }

    @Override
    public void buildRooms(int number)
    {
        swimmingPoolHouse.setRooms(number);
    }

    @Override
    public void buildDoors(int number)
    {
        swimmingPoolHouse.setDoors(number);
    }

    @Override
    public void buildWindows(int number)
    {
        swimmingPoolHouse.setWindows(number);
    }

    @Override
    public void buildGarage(String type)
    {

    }

    @Override
    public void buildSwimmingPool(String type)
    {
        swimmingPoolHouse.setSwimmingPool(type);
    }

    @Override
    public void buildGarden(String type)
    {

    }

    public SwimmingPoolHouse getProduct() {
        SwimmingPoolHouse product = this.swimmingPoolHouse;
        this.reset();
        return product;
    }
}
