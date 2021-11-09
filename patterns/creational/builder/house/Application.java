package patterns.creational.builder.house;

public class Application
{
    public static void main(String[] args) {
        GarageHouse garageHouse = new GarageHouse();
        garageHouse.setDoors(10);
        garageHouse.setWindows(15);
        garageHouse.setRooms(7);
        garageHouse.setGarage("Two cars");
        System.out.println(garageHouse);

        SwimmingPoolHouse swimmingPoolHouse = new SwimmingPoolHouse();
        swimmingPoolHouse.setDoors(12);
        swimmingPoolHouse.setWindows(17);
        swimmingPoolHouse.setRooms(10);
        swimmingPoolHouse.setSwimmingPool("semi-olympic");
        System.out.println(swimmingPoolHouse);

        GardenHouse gardenHouse = new GardenHouse();
        gardenHouse.setDoors(8);
        gardenHouse.setWindows(10);
        gardenHouse.setRooms(6);
        gardenHouse.setGarden("roses");
        System.out.println(gardenHouse);
    }
}
