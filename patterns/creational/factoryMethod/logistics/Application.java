package patterns.creational.factoryMethod.logistics;

import java.util.Scanner;

public class Application
{
    private Logistics logistics;

    public void initialize(String logisticsType) throws Exception {
        if (logisticsType.equals("road")) {
            logistics = new RoadLogistics();
        }
        else if (logisticsType.equals("sea")) {
            logistics = new SeaLogistics();
        }
        else if (logisticsType.equals("air")) {
            logistics = new AirLogistics();
        }
        else {
            throw new Exception("Unsupported logistics");
        }
    }

    public void main(String logisticsType) throws Exception {
        this.initialize(logisticsType);
        logistics.planDelivery();
        //....
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona el tipo de logistica (road/sea/air): ");
        String logisticsType = scanner.next();

        Application application = new Application();

        try
        {
            application.main(logisticsType);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
