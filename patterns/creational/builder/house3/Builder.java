package patterns.creational.builder.house3;

public interface Builder
{
    void reset();
    void buildRooms(int number);
    void buildDoors(int number);
    void buildWindows(int number);
    void buildGarage(String type);
    void buildSwimmingPool(String type);
    void buildGarden(String type);
}
