package patterns.creational.builder.house2;

public class House
{
    private int windows;
    private int doors;
    private int rooms;
    private String garage;
    private String swimmingPool;
    private String garden;

    public House(int windows, int doors, int rooms, String garage, String swimmingPool, String garden)
    {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garage = garage;
        this.swimmingPool = swimmingPool;
        this.garden = garden;
    }

    public int getWindows()
    {
        return windows;
    }

    public void setWindows(int windows)
    {
        this.windows = windows;
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public int getRooms()
    {
        return rooms;
    }

    public void setRooms(int rooms)
    {
        this.rooms = rooms;
    }

    public String getGarage()
    {
        return garage;
    }

    public void setGarage(String garage)
    {
        this.garage = garage;
    }

    public String getSwimmingPool()
    {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool)
    {
        this.swimmingPool = swimmingPool;
    }

    public String getGarden()
    {
        return garden;
    }

    public void setGarden(String garden)
    {
        this.garden = garden;
    }

    @Override
    public String toString()
    {
        return "House{" +
               "windows=" + windows +
               ", doors=" + doors +
               ", rooms=" + rooms +
               ", garage='" + garage + '\'' +
               ", swimmingPool='" + swimmingPool + '\'' +
               ", garden='" + garden + '\'' +
               '}';
    }
}
