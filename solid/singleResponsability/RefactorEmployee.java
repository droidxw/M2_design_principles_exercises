package solid.singleResponsability;

public class RefactorEmployee
{
    private String name;

    public RefactorEmployee(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}