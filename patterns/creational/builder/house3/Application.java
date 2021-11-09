package patterns.creational.builder.house3;

public class Application
{
    public static void main(String[] args) {
        Director director = new Director();

        GarageHouseBuilder builder = new GarageHouseBuilder();
        director.constructGarageHouse(builder);
        GarageHouse garageHouse = builder.getProduct();
        System.out.println(garageHouse);

        SwimmingPoolHouseBuilder builder2 = new SwimmingPoolHouseBuilder();
        director.constructSwimmingPoolHouse(builder2);
        SwimmingPoolHouse swimmingPoolHouse = builder2.getProduct();
        System.out.println(swimmingPoolHouse);

        GardenHouseBuilder builder3 = new GardenHouseBuilder();
        director.constructGardenHouse(builder3);
        GardenHouse gardenHouse = builder3.getProduct();
        System.out.println(gardenHouse);
    }
}
