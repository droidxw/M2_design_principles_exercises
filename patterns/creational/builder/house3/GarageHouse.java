package patterns.creational.builder.house3;

public class GarageHouse
{
    private int windows;
    private int doors;
    private int rooms;
    private String garage;

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

    @Override
    public String toString()
    {
        return "GarageHouse{" +
               "windows=" + windows +
               ", doors=" + doors +
               ", rooms=" + rooms +
               ", garage='" + garage + '\'' +
               '}';
    }
}
