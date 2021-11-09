package patterns.creational.builder.house3;

public class Director
{
    public void constructGarageHouse(Builder builder)
    {
        builder.reset();
        builder.buildDoors(10);
        builder.buildWindows(12);
        builder.buildRooms(8);
        builder.buildGarage("two cars");
    }

    public void constructSwimmingPoolHouse(Builder builder)
    {
        builder.reset();
        builder.buildDoors(10);
        builder.buildWindows(12);
        builder.buildRooms(8);
        builder.buildSwimmingPool("semi-olympic");
    }

    public void constructGardenHouse(Builder builder)
    {
        builder.reset();
        builder.buildDoors(10);
        builder.buildWindows(12);
        builder.buildRooms(8);
        builder.buildGarden("roses");
    }
}