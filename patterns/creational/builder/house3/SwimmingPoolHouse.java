package patterns.creational.builder.house3;

public class SwimmingPoolHouse
{
    private int windows;
    private int doors;
    private int rooms;
    private String swimmingPool;

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

    public String getSwimmingPool()
    {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool)
    {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public String toString()
    {
        return "SwimmingPoolHouse{" +
               "windows=" + windows +
               ", doors=" + doors +
               ", rooms=" + rooms +
               ", swimmingPool='" + swimmingPool + '\'' +
               '}';
    }
}
