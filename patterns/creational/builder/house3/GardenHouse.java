package patterns.creational.builder.house3;

public class GardenHouse
{
    private int windows;
    private int doors;
    private int rooms;
    private String garden;

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
        return "GardenHouse{" +
               "windows=" + windows +
               ", doors=" + doors +
               ", rooms=" + rooms +
               ", garden='" + garden + '\'' +
               '}';
    }
}
