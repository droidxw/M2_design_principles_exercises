package patterns.creational.builder.house2;

public class Application
{
    public static void main(String[] args) {
        House house = new House(15, 10, 7, "Two cars", null, null);
        System.out.println(house);

        house = new House(12, 17, 10, null, "semi-olympic", null);
        System.out.println(house);

        house = new House(10, 8, 6, null, null, "roses");
        System.out.println(house);
    }
}
