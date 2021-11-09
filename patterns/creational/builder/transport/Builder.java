package patterns.creational.builder.transport;

public interface Builder
{
    void reset();
    void setSeats(int numberOfSits);
    void setDoors(int numberOfDoors);
    void setEngine(String engineType);
    void setTripComputer(String computerType);
    void setGPS(String gpsType);
}
