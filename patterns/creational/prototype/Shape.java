package patterns.creational.prototype;

public abstract class Shape
{
    private int x;
    private int y;
    private String colour;

    public Shape()
    {
    }

    public Shape(Shape source)
    {
        this();
        this.x = source.x;
        this.y = source.y;
        this.colour = source.colour;
    }

    public abstract Shape clone();

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    @Override
    public String toString()
    {
        return "Shape{" +
               "Hash code: " + hashCode() +
               "x=" + x +
               ", y=" + y +
               ", colour='" + colour + '\'' +
               '}';
    }
}
